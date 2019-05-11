package ru.mustakimov.insta.model

import com.fasterxml.jackson.annotation.JsonProperty
import javax.annotation.Generated

@Generated("com.robohorse.robopojogenerator")
data class InItem(

	@field:JsonProperty("position")
	val position: List<Double?>? = null,

	@field:JsonProperty("start_time_in_video_in_sec")
	val startTimeInVideoInSec: Any? = null,

	@field:JsonProperty("user")
	val user: User? = null,

	@field:JsonProperty("duration_in_video_in_sec")
	val durationInVideoInSec: Any? = null
)