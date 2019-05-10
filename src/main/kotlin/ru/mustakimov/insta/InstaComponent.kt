package ru.mustakimov.insta

import org.brunocvcunha.instagram4j.Instagram4j
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class InstaComponent {
    @Bean
    fun provideInstagram(): Instagram4j {
        return Instagram4j.builder()
            .username("mikhailmustakimov")
            .password("mike57business")
            .build()
            .apply {
                setup()
                login()
            }
    }

}