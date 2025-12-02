package org.example.Lesson_2

fun main() {

    var salaryWorker = 30000
    var salaryIntern = 20000
    var quantityWorker = 50
    var quantityIntern = 30

    var salaryWorkers = quantityWorker * salaryWorker
    var salaryWorkersWithInterns = salaryWorkers + quantityIntern * salaryIntern
    var salaryMedian = salaryWorkersWithInterns/(quantityWorker+quantityIntern)

    println(salaryWorkers)
    println(salaryWorkersWithInterns)
    println(salaryMedian)

}