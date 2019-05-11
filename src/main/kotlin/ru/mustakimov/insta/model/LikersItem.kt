package ru.mustakimov.insta.model

import com.fasterxml.jackson.annotation.JsonProperty
import javax.annotation.Generated

@Generated("com.robohorse.robopojogenerator")
data class LikersItem(

	@field:JsonProperty("is_private")
	val isPrivate: Boolean? = null,

	@field:JsonProperty("full_name")
	val fullName: String? = null,

	@field:JsonProperty("profile_pic_id")
	val profilePicId: String? = null,

	@field:JsonProperty("pk")
	val pk: Long? = null,

	@field:JsonProperty("profile_pic_url")
	val profilePicUrl: String? = null,

	@field:JsonProperty("is_verified")
	val isVerified: Boolean? = null,

	@field:JsonProperty("username")
	val username: String? = null
)