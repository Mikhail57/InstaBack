package ru.mustakimov.insta

import org.brunocvcunha.instagram4j.Instagram4j
import org.brunocvcunha.instagram4j.requests.InstagramTagFeedRequest
import org.brunocvcunha.instagram4j.requests.payload.InstagramFeedItem
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cache.annotation.Cacheable
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component
import org.springframework.stereotype.Service
import java.net.URLEncoder


interface InstagramRepository {
    fun getPostsByTagName(tag: String): List<InstagramFeedItem>
    fun getPostsWithLocationByTagName(tag: String): List<InstagramFeedItem>
    fun getPostsFromLocation(lat: Float, lon: Float): List<InstagramFeedItem>
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

    override fun getPostsFromLocation(lat: Float, lon: Float): List<InstagramFeedItem> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}