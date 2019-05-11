package ru.mustakimov.insta.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import javax.annotation.Generated

@Generated("com.robohorse.robopojogenerator")
@JsonIgnoreProperties(ignoreUnknown = true)
data class PreviewCommentsItem(

	@field:JsonProperty("share_enabled")
	val shareEnabled: Boolean? = null,

	@field:JsonProperty("created_at")
	val createdAt: Int? = null,

	@field:JsonProperty("type")
	val type: Int? = null,

	@field:JsonProperty("created_at_utc")
	val createdAtUtc: Int? = null,

	@field:JsonProperty("has_translation")
	val hasTranslation: Boolean? = null,

	@field:JsonProperty("content_type")
	val contentType: String? = null,

	@field:JsonProperty("user_id")
	val userId: Long? = null,

	@field:JsonProperty("bit_flags")
	val bitFlags: Int? = null,

	@field:JsonProperty("media_id")
	val mediaId: Long? = null,

	@field:JsonProperty("pk")
	val pk: Long? = null,

	@field:JsonProperty("text")
	val text: String? = null,

	@field:JsonProperty("did_report_as_spam")
	val didReportAsSpam: Boolean? = null,

	@field:JsonProperty("user")
	val user: User? = null,

	@field:JsonProperty("status")
	val status: String? = null
)