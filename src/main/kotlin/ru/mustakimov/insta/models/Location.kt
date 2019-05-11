package ru.mustakimov.insta.models

import com.fasterxml.jackson.annotation.JsonProperty
import javax.annotation.Generated

@Generated("com.robohorse.robopojogenerator")
data class Location(

	@field:JsonProperty("address")
	val address: String? = null,

	@field:JsonProperty("lng")
	val lng: Double? = null,

	@field:JsonProperty("city")
	val city: String? = null,

	@field:JsonProperty("name")
	val name: String? = null,

	@field:JsonProperty("facebook_places_id")
	val facebookPlacesId: Long? = null,

	@field:JsonProperty("short_name")
	val shortName: String? = null,

	@field:JsonProperty("pk")
	val pk: Long? = null,

	@field:JsonProperty("lat")
	val lat: Double? = null,

	@field:JsonProperty("external_source")
	val externalSource: String? = null
)