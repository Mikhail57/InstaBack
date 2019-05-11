package ru.mustakimov.insta.model

import com.fasterxml.jackson.annotation.JsonProperty
import javax.annotation.Generated

@Generated("com.robohorse.robopojogenerator")
data class InstagramExploreItemInfo(

	@field:JsonProperty("num_columns")
	val numColumns: Int? = null,

	@field:JsonProperty("aspect_ratio")
	val aspectRatio: Int? = null,

	@field:JsonProperty("total_num_columns")
	val totalNumColumns: Int? = null,

	@field:JsonProperty("autoplay")
	val autoplay: Boolean? = null
)