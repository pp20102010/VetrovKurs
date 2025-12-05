package org.example.Lesson_5

const val BELOV_IS_INSUFFICIENT = 18.5  // ИМТ ниже - Недостаточная масса тела
const val BELOV_NORMAL = 25             // ИМТ ниже - Нормальная масса тела
const val BELOV_EXCESS_WEIGHT = 30      // ИМТ ниже - Избыточная масса тела иначе Ожирение


fun main() {
    print("Введите Ваш вес (кг.): ")
    val weight = readln().toFloat()
    print("Введите Ваш рост (см.): ")
    val height = readln().toFloat() / 100
    val bodyMassIndex = weight / (height * height)
    val diagnosis: String

    if (bodyMassIndex < BELOV_IS_INSUFFICIENT) diagnosis = "Недостаточная масса тела"
    else if (bodyMassIndex < BELOV_NORMAL) diagnosis = "Нормальная масса тела"
    else if (bodyMassIndex < BELOV_EXCESS_WEIGHT) diagnosis = "Избыточная масса тела"
    else diagnosis = "Ожирение"

    println("Ваш ИМТ= %.2f ($diagnosis)".format(bodyMassIndex))
}