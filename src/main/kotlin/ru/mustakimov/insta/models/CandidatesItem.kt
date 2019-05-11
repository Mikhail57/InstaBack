package ru.mustakimov.insta.models

import com.fasterxml.jackson.annotation.JsonProperty
import javax.annotation.Generated

@Generated("com.robohorse.robopojogenerator")
data class CandidatesItem(

	@field:JsonProperty("width")
	val width: Int? = null,

	@field:JsonProperty("url")
	val url: String? = null,

	@field:JsonProperty("height")
	val height: Int? = null
)