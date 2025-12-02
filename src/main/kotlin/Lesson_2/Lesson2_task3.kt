package org.example.Lesson_2

fun main() {

    var departureTimesH: Int = 9
    var departureTimesM: Int = 39
    var travelTimeM: Int = 457

    var arrivalTimeH = String.format("%02d", (departureTimesH*60+departureTimesM+travelTimeM)/60)
    var arrivalTimeM = String.format("%02d", (departureTimesH*60+departureTimesM+travelTimeM)%60)

    println("$arrivalTimeH:$arrivalTimeM")

}