package ru.mustakimov.insta

import kotlin.math.*

fun haversine(l1: Location, l2: Location): Float {
    val (lat1, lon1) = l1.toRadian()
    val (lat2, lon2) = l2.toRadian()

    val dlon = lon2 - lon1
    val dlat = lat2 - lat1

    val a = sin(dlat / 2).pow(2) + (cos(lat1) * cos(lat2) * sin(dlon / 2)).pow(2)
    val c = 2 * asin(sqrt(a))
    val r = 6371

    return c * r
}

data class Location(
    val latitude: Float,
    val longitude: Float
)

fun Float.toRadian(): Float = (this * PI / 180).toFloat()

fun Location.toRadian(): Location = Location(latitude.toRadian(), longitude.toRadian())