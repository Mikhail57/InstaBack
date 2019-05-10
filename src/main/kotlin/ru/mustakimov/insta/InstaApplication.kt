package ru.mustakimov.insta

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching

@SpringBootApplication
@EnableCaching
class InstaApplication

fun main(args: Array<String>) {
    runApplication<InstaApplication>(*args)
}
