package controlFlow

fun main() {
    for (i in 0..3) {
        print(i) // 0123
    }
    println()

    for (i in 0 until 3) {
        print(i) // 012
    }
    println()

    for (i in 2..8 step 2) {
        print(i) // 2468
    }
    println()

    for (i in 3 downTo 0) {
        print(i) // 3210
    }
    println()

    for (c in 'a'..'d') {
        print(c) // abcd
    }
    println()

    for (c in 'z' downTo 's' step 2) {
        print(c) // zxvt
    }
    println()

    val x = 2
    if (x in 1..5) {
        print("x is in range from 1 to 5")
    }
    println()

    if (x !in 6..10) {
        print("x is not in range from 6 to 10")
    }
}