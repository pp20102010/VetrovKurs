package org.example.Lesson_1

fun main() {
    val seconds: Int = 6480
    val hour = String.format("%02d", seconds/3600)
    val minute = String.format("%02d", seconds%3600/60)
    val seconds2 = String.format("%02d", (seconds%3600)%60)

    println("$hour:$minute:$seconds2")
}