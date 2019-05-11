package ru.mustakimov.insta.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer
import ru.mustakimov.insta.resolver.CsvViewResolver
import org.springframework.web.servlet.ViewResolver
import java.util.ArrayList
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver
import org.springframework.web.accept.ContentNegotiationManager




@Configuration
class WebConfig : WebMvcConfigurer {

    override fun configureContentNegotiation(configurer: ContentNegotiationConfigurer) {
        configurer
            .defaultContentType(MediaType.APPLICATION_JSON)
            .favorPathExtension(true)
    }

    @Bean
    fun contentNegotiatingViewResolver(manager: ContentNegotiationManager): ViewResolver {
        val resolver = ContentNegotiatingViewResolver()
        resolver.contentNegotiationManager = manager

        // Define all possible view resolvers
        val resolvers = ArrayList<ViewResolver>()

        resolvers.add(csvViewResolver())

        resolver.viewResolvers = resolvers
        return resolver
    }

    /*
     * Configure View resolver to provide Csv output using Super Csv library to
     * generate Csv output for an object content
     */
    @Bean
    fun csvViewResolver(): ViewResolver {
        return CsvViewResolver()
    }
}
