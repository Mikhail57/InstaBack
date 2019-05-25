package ru.mustakimov.insta

import org.brunocvcunha.instagram4j.Instagram4j
import org.brunocvcunha.instagram4j.requests.InstagramSearchLocationsRequest
import org.brunocvcunha.instagram4j.requests.InstagramTagFeedRequest
import org.brunocvcunha.instagram4j.requests.payload.InstagramFeedItem
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Service
import ru.mustakimov.insta.model.InstagramLocationFeedSectionsResult
import ru.mustakimov.insta.model.Media
import java.net.URLEncoder


interface InstagramRepository {
    fun getPostsByTagName(tag: String): List<InstagramFeedItem>
    fun getPostsWithLocationByTagName(tag: String): List<InstagramFeedItem>
    fun getPostsFromLocation(lat: Float, lng: Float, radius: Float? = null): List<Media>
}

@Service
class InstagramNetworkRepository : InstagramRepository {
    @Autowired
    lateinit var instagram: Instagram4j

    @Cacheable("instagram_by_tag")
    override fun getPostsByTagName(tag: String): List<InstagramFeedItem> {
        val encodedTag = URLEncoder.encode(tag, Charsets.UTF_8)
        return instagram.sendRequest(InstagramTagFeedRequest(encodedTag)).items
    }

    @Cacheable("instagram_by_tag_location")
    override fun getPostsWithLocationByTagName(tag: String): List<InstagramFeedItem> {
        return getPostsByTagName(tag).filter {
            it.location?.isEmpty()?.not() ?: false
        }
    }

    @Cacheable("instagram_by_location_posts")
    override fun getPostsFromLocation(lat: Float, lng: Float, radius: Float?): List<Media> {
        val locationsRequest = InstagramSearchLocationsRequest(lat.toString(), lng.toString(), "")
        val unorderedVenues = instagram.sendRequest(locationsRequest).venues
        val venues = if (radius == null)
            unorderedVenues.sortedBy {
                haversine(Location(lat, lng), Location(it.lat.toFloat(), it.lng.toFloat()))
            }
        else
            unorderedVenues.filter {
                haversine(
                    Location(lat, lng),
                    Location(it.lat.toFloat(), it.lng.toFloat())
                ) <= radius
            }
        if (venues.isEmpty())
            return emptyList()

        if (radius == null) {
            val location = venues[0]
            val request = InstagramFacebookLocationFeedRequest(location.external_id)
            return instagram.sendRequest(request).toInstagramFeedItems()
        }

        return venues.flatMap { location ->
            val request = InstagramFacebookLocationFeedRequest(location.external_id)
            instagram.sendRequest(request).toInstagramFeedItems()
        }
    }

}

private fun InstagramLocationFeedSectionsResult.toInstagramFeedItems(): List<Media> {
    return sections
        .flatMap { section -> section.layoutContent.medias }
        .map { it.media }
}
