package ru.mustakimov.insta.resolver

import org.springframework.web.servlet.View
import org.springframework.web.servlet.ViewResolver
import ru.mustakimov.insta.view.CsvView

import java.util.Locale

class CsvViewResolver : ViewResolver {

    override fun resolveViewName(viewName: String, locale: Locale): View? {
        return CsvView()
    }
}