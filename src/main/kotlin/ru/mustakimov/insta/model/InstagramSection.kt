package ru.mustakimov.insta.model

import com.fasterxml.jackson.annotation.JsonProperty
import javax.annotation.Generated

@Generated("com.robohorse.robopojogenerator")
data class InstagramSection(

	@field:JsonProperty("layout_content")
	val layoutContent: InstagamLayoutContent,

	@field:JsonProperty("explore_item_info")
	val exploreItemInfo: InstagramExploreItemInfo,

	@field:JsonProperty("layout_type")
	val layoutType: String,

	@field:JsonProperty("feed_type")
	val feedType: String
)