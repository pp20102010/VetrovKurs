package org.example.Lesson_3

fun main() {
    var x = 9
    var res = """
        $x * 1 = ${x*1}
        $x * 2 = ${x*2}
        $x * 3 = ${x*3}
        $x * 4 = ${x*4}
        $x * 5 = ${x*5}
        $x * 6 = ${x*6}
        $x * 7 = ${x*7}
        $x * 8 = ${x*8}
        $x * 9 = ${x*9}
    """.trimIndent()
    println(res)
}