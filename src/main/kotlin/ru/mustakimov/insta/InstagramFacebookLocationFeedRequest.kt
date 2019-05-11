package ru.mustakimov.insta

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import org.brunocvcunha.instagram4j.requests.InstagramPostRequest
import ru.mustakimov.insta.models.InstagramLocationFeedSectionsResult
import java.util.LinkedHashMap

class InstagramFacebookLocationFeedRequest(
    private val location: String,
    private val maxId: String? = null
) : InstagramPostRequest<InstagramLocationFeedSectionsResult>() {
    override fun getUrl(): String {
        return "locations/$location/sections/"
    }

    override fun getPayload(): String {
        val mapper = ObjectMapper()

        val payloadMap = LinkedHashMap<String, Any>()
        payloadMap["rank_token"] = api.rankToken
        payloadMap["_csrftoken"] = api.orFetchCsrf
        payloadMap["_uuid"] = api.uuid
        payloadMap["tab"] = "ranked"

        return mapper.writeValueAsString(payloadMap)
    }

    override fun parseResult(resultCode: Int, content: String?): InstagramLocationFeedSectionsResult {
        val mapper = jacksonObjectMapper()
        return mapper.readValue(content!!)
//        return parseJson(resultCode, content, InstagramLocationFeedResult::class.java)
    }
}