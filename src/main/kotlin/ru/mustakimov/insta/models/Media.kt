package ru.mustakimov.insta.models

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import javax.annotation.Generated

@Generated("com.robohorse.robopojogenerator")
@JsonIgnoreProperties(ignoreUnknown = true)
data class Media(

	@field:JsonProperty("comment_count")
	val commentCount: Int? = null,

	@field:JsonProperty("code")
	val code: String? = null,

	@field:JsonProperty("has_liked")
	val hasLiked: Boolean? = null,

	@field:JsonProperty("can_viewer_reshare")
	val canViewerReshare: Boolean? = null,

	@field:JsonProperty("caption")
	val caption: Caption? = null,

	@field:JsonProperty("can_view_more_preview_comments")
	val canViewMorePreviewComments: Boolean? = null,

	@field:JsonProperty("max_num_visible_preview_comments")
	val maxNumVisiblePreviewComments: Int? = null,

	@field:JsonProperty("media_type")
	val mediaType: Int? = null,

	@field:JsonProperty("filter_type")
	val filterType: Int? = null,

	@field:JsonProperty("device_timestamp")
	val deviceTimestamp: Long? = null,

	@field:JsonProperty("comment_threading_enabled")
	val commentThreadingEnabled: Boolean? = null,

	@field:JsonProperty("original_height")
	val originalHeight: Int? = null,

	@field:JsonProperty("id")
	val id: String? = null,

	@field:JsonProperty("lat")
	val lat: Double? = null,

	@field:JsonProperty("original_width")
	val originalWidth: Int? = null,

	@field:JsonProperty("like_count")
	val likeCount: Int? = null,

	@field:JsonProperty("lng")
	val lng: Double? = null,

	@field:JsonProperty("comment_likes_enabled")
	val commentLikesEnabled: Boolean? = null,

	@field:JsonProperty("photo_of_you")
	val photoOfYou: Boolean? = null,

	@field:JsonProperty("preview_comments")
	val previewComments: List<PreviewCommentsItem?>? = null,

	@field:JsonProperty("organic_tracking_token")
	val organicTrackingToken: String? = null,

	@field:JsonProperty("top_likers")
	val topLikers: List<Any?>? = null,

	@field:JsonProperty("client_cache_key")
	val clientCacheKey: String? = null,

	@field:JsonProperty("taken_at")
	val takenAt: Int? = null,

	@field:JsonProperty("caption_is_edited")
	val captionIsEdited: Boolean? = null,

	@field:JsonProperty("image_versions2")
	val imageVersions2: ImageVersions2? = null,

	@field:JsonProperty("location")
	val location: Location? = null,

	@field:JsonProperty("pk")
	val pk: Long? = null,

	@field:JsonProperty("can_viewer_save")
	val canViewerSave: Boolean? = null,

	@field:JsonProperty("has_more_comments")
	val hasMoreComments: Boolean? = null,

	@field:JsonProperty("user")
	val user: User? = null,

	@field:JsonProperty("video_duration")
	val videoDuration: Double? = null,

	@field:JsonProperty("has_audio")
	val hasAudio: Boolean? = null,

	@field:JsonProperty("usertags")
	val usertags: Usertags? = null,

	@field:JsonProperty("video_dash_manifest")
	val videoDashManifest: String? = null,

	@field:JsonProperty("video_versions")
	val videoVersions: List<VideoVersionsItem?>? = null,

	@field:JsonProperty("video_codec")
	val videoCodec: String? = null,

	@field:JsonProperty("is_dash_eligible")
	val isDashEligible: Int? = null,

	@field:JsonProperty("number_of_qualities")
	val numberOfQualities: Int? = null,

	@field:JsonProperty("view_count")
	val viewCount: Double? = null
)