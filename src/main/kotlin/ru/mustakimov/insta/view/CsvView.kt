package ru.mustakimov.insta.view

import org.brunocvcunha.instagram4j.requests.payload.InstagramFeedItem
import org.supercsv.io.CsvMapWriter
import org.supercsv.prefs.CsvPreference
import ru.mustakimov.insta.model.Media

import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse


class CsvView : AbstractCsvView() {


    @Throws(Exception::class)
    override fun buildCsvDocument(
        model: Map<String, Any>,
        request: HttpServletRequest,
        response: HttpServletResponse
    ) {
        response.setHeader("Content-Disposition", "attachment; filename=\"export.csv\"")
        val writer = CsvMapWriter(response.writer, CsvPreference.STANDARD_PREFERENCE)

        val data = model["data"] as? List<*> ?: return

        if (data[0] is InstagramFeedItem) {
            data.map {
                val v = it as InstagramFeedItem
                mapOf(
                    "instagram_id" to v.code,
                    "lat" to v.lat,
                    "lng" to v.lng,
                    "timestamp" to v.taken_at
                )
            }.forEach {
                writer.write(it)
            }
        } else if (data[0] is Media) {
            data.map {
                val v = it as Media
                mapOf(
                    "instagram_id" to v.code,
                    "lat" to v.lat,
                    "lng" to v.lng,
                    "timestamp" to v.takenAt
                )
            }.forEach {
                writer.write(it)
            }
        }
        writer.close()
    }
}