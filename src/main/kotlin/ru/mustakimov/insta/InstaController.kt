package ru.mustakimov.insta

import org.brunocvcunha.instagram4j.requests.payload.InstagramFeedItem
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import ru.mustakimov.insta.models.Media

@RestController
class InstaController(
    private val instagramRepository: InstagramRepository
) {

    @GetMapping("tag/{tag}")
    fun getInfoForTag(@PathVariable("tag") tag: String): List<InstagramFeedItem> {
        return instagramRepository.getPostsWithLocationByTagName(tag)
    }

    @GetMapping("/location", params = ["lat", "lng"])
    fun getPostsByLocation(
        @RequestParam("lat") lat: Float,
        @RequestParam("lng") lng: Float
    ): List<Media> {
        return instagramRepository.getPostsFromLocation(lat, lng)
    }
}

@Controller
class InstaDownloadController(
    private val instagramRepository: InstagramRepository
) {

    @GetMapping("/download/tag/{tag}")
    fun getInfoForTag(@PathVariable("tag") tag: String): List<InstagramFeedItem> {
        return instagramRepository.getPostsWithLocationByTagName(tag)
    }

    @GetMapping("/download/location", params = ["lat", "lng"])
    fun getPostsByLocation(
        @RequestParam("lat") lat: Float,
        @RequestParam("lng") lng: Float
    ): List<Media> {
        return instagramRepository.getPostsFromLocation(lat, lng)
    }
}