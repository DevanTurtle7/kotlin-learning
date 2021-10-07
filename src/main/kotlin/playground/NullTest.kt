package playground

fun plusPlus(int: Int?) = int?.plus(1) ?: 0

fun main() {
    println(plusPlus(null))
    println(plusPlus(0))
    println(plusPlus(4))
    println(plusPlus(3))
    println(plusPlus(-2))
}