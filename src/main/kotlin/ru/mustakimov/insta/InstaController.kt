package ru.mustakimov.insta

import org.brunocvcunha.instagram4j.requests.payload.InstagramFeedItem
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class InstaController(
    private val instagramRepository: InstagramRepository
) {

    @GetMapping("tag/{tag}")
    fun getInfoForTag(@PathVariable("tag") tag: String): List<InstagramFeedItem> {
        return instagramRepository.getPostsWithLocationByTagName(tag)
    }
}