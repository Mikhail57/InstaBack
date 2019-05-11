package ru.mustakimov.insta.models

import com.fasterxml.jackson.annotation.JsonProperty
import javax.annotation.Generated

@Generated("com.robohorse.robopojogenerator")
data class InstagamLayoutContent(

	@field:JsonProperty("medias")
	val medias: List<InstagramMediaItem>
)