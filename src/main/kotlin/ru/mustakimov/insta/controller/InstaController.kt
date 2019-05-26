package ru.mustakimov.insta.controller

import org.brunocvcunha.instagram4j.requests.payload.InstagramFeedItem
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import ru.mustakimov.insta.InstagramRepository
import ru.mustakimov.insta.model.Media

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
        @RequestParam("lat") lat: Double,
        @RequestParam("lng") lng: Double,
        @RequestParam("r") radius: Float?
    ): List<Media> {
        return instagramRepository.getPostsFromLocation(lat, lng, radius)
    }
}