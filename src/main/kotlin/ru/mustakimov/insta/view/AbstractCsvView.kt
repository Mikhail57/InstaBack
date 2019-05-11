package ru.mustakimov.insta.view

import org.springframework.web.servlet.view.AbstractView

import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

abstract class AbstractCsvView : AbstractView() {
    init {
        contentType = CONTENT_TYPE
    }

    override fun generatesDownloadContent(): Boolean {
        return true
    }


    @Throws(Exception::class)
    override fun renderMergedOutputModel(
        model: Map<String, Any>, request: HttpServletRequest, response: HttpServletResponse
    ) {
        response.contentType = contentType
        buildCsvDocument(model, request, response)
    }

    @Throws(Exception::class)
    protected abstract fun buildCsvDocument(
        model: Map<String, Any>, request: HttpServletRequest, response: HttpServletResponse
    )

    companion object {

        private val CONTENT_TYPE = "text/csv"
    }


}