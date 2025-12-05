package org.example.Lesson_1

const val SECONDS_IN_AN_MINUT = 60
const val SECONDS_IN_AN_HOUR = 60 * 60

fun main() {
    val totalSeconds: Int = 6480
    val hours = totalSeconds / SECONDS_IN_AN_HOUR
    val minutes = totalSeconds % SECONDS_IN_AN_HOUR / SECONDS_IN_AN_MINUT
    val seconds = (totalSeconds % SECONDS_IN_AN_HOUR) % SECONDS_IN_AN_MINUT

    //val seconds2 = String.format("%02d", (seconds % SECONDS_IN_AN_HOUR) % SECONDS_IN_AN_MINUT)
    //println("$hour:$minute:$seconds2")

    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}