package ru.mustakimov.insta.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class User(

	@field:JsonProperty("is_private")
	val isPrivate: Boolean? = null,

	@field:JsonProperty("full_name")
	val fullName: String? = null,

	@field:JsonProperty("is_favorite")
	val isFavorite: Boolean? = null,

	@field:JsonProperty("profile_pic_id")
	val profilePicId: String? = null,

	@field:JsonProperty("is_unpublished")
	val isUnpublished: Boolean? = null,

	@field:JsonProperty("pk")
	val pk: Long? = null,

	@field:JsonProperty("has_anonymous_profile_picture")
	val hasAnonymousProfilePicture: Boolean? = null,

	@field:JsonProperty("profile_pic_url")
	val profilePicUrl: String? = null,

	@field:JsonProperty("username")
	val username: String? = null,

	@field:JsonProperty("is_verified")
	val isVerified: Boolean? = null
)