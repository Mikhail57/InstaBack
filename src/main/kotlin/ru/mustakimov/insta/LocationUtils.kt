package ru.mustakimov.insta

import java.lang.Math.toRadians
import kotlin.math.atan2
import kotlin.math.cos
import kotlin.math.sqrt


private const val EARTH_RADIUS = 6371 // Approx Earth radius in KM


data class Location(
    val latitude: Double,
    val longitude: Double
)

fun distance(start: Location, end: Location): Double {
    var startLat = start.latitude
    var endLat = end.latitude

    val dLat = toRadians(endLat - startLat)
    val dLong = toRadians(end.longitude - start.longitude)

    startLat = toRadians(startLat)
    endLat = toRadians(endLat)

    val a = haversin(dLat) + cos(startLat) * cos(endLat) * haversin(dLong)
    val c = 2 * atan2(Math.sqrt(a), sqrt(1 - a))

    return EARTH_RADIUS * c
}

private fun haversin(angle: Double): Double {
    return Math.pow(Math.sin(angle / 2), 2.0)
}
