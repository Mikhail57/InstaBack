package ru.mustakimov.insta.models

import com.fasterxml.jackson.annotation.JsonProperty
import org.brunocvcunha.instagram4j.requests.payload.InstagramFeedItem
import javax.annotation.Generated

@Generated("com.robohorse.robopojogenerator")
data class InstagramMediaItem(

	@field:JsonProperty("media")
	val media: Media
)