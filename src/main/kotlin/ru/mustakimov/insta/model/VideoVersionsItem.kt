package ru.mustakimov.insta.model

import com.fasterxml.jackson.annotation.JsonProperty
import javax.annotation.Generated

@Generated("com.robohorse.robopojogenerator")
data class VideoVersionsItem(

	@field:JsonProperty("width")
	val width: Int? = null,

	@field:JsonProperty("id")
	val id: String? = null,

	@field:JsonProperty("type")
	val type: Int? = null,

	@field:JsonProperty("url")
	val url: String? = null,

	@field:JsonProperty("height")
	val height: Int? = null
)