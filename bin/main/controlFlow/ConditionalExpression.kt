package controlFlow

fun max(a: Int, b: Int): Int {
    val result = if (a > b) a else b // Ternary operator

    return result
}

fun min(a: Int, b: Int) = if (a < b) a else b

fun main() {
    println(max(99, -42))
    println(min(100, 200))
}