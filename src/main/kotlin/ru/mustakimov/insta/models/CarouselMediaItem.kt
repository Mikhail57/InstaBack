package ru.mustakimov.insta.models

import com.fasterxml.jackson.annotation.JsonProperty
import javax.annotation.Generated

@Generated("com.robohorse.robopojogenerator")
data class CarouselMediaItem(

	@field:JsonProperty("original_width")
	val originalWidth: Int? = null,

	@field:JsonProperty("carousel_parent_id")
	val carouselParentId: String? = null,

	@field:JsonProperty("media_type")
	val mediaType: Int? = null,

	@field:JsonProperty("image_versions2")
	val imageVersions2: ImageVersions2? = null,

	@field:JsonProperty("original_height")
	val originalHeight: Int? = null,

	@field:JsonProperty("id")
	val id: String? = null,

	@field:JsonProperty("pk")
	val pk: Long? = null
)