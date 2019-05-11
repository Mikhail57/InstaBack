package ru.mustakimov.insta.model

import com.fasterxml.jackson.annotation.JsonProperty
import javax.annotation.Generated

@Generated("com.robohorse.robopojogenerator")
data class InstagramLocationFeedSectionsResult(

	@field:JsonProperty("next_page")
	val nextPage: Int,

	@field:JsonProperty("more_available")
	val moreAvailable: Boolean,

	@field:JsonProperty("next_max_id")
	val nextMaxId: String,

	@field:JsonProperty("sections")
	val sections: List<InstagramSection>,

	@field:JsonProperty("next_media_ids")
	val nextMediaIds: List<Long>,

	@field:JsonProperty("status")
	val status: String
)