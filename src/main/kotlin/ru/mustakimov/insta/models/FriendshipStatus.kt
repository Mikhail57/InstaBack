package ru.mustakimov.insta.models

import com.fasterxml.jackson.annotation.JsonProperty
import javax.annotation.Generated

@Generated("com.robohorse.robopojogenerator")
data class FriendshipStatus(

	@field:JsonProperty("is_restricted")
	val isRestricted: Boolean? = null,

	@field:JsonProperty("following")
	val following: Boolean? = null,

	@field:JsonProperty("outgoing_request")
	val outgoingRequest: Boolean? = null,

	@field:JsonProperty("is_bestie")
	val isBestie: Boolean? = null
)