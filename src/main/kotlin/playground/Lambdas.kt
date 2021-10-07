package playground

fun test(ints: Collection<Int>): Unit {
    ints.forEach{println(it)}
}

fun main() {
    val ints = mutableListOf<Int>()
    ints.add(1)
    ints.add(2)
    ints.add(3)
    ints.add(4)
    ints.add(5)
    ints.add(6)

    test(ints)
}