package org.example.Lesson_5

fun main() {
    print("Введите расстояние поездки (в километрах): ")
    val distance = readln().toFloat()
    print("Расход топлива на 100 км (в литрах): ")
    val consumption = readln().toFloat()
    print("Текущую цену за литр топлива(в рублях): ")
    val price = readln().toFloat()
    val fuel = distance/100*consumption
    println("Для поездки необходимо %.2f литров топлива (на сумму %.2f руб.)".format( fuel, fuel*price ))
}