fun printMessage(message: String): Unit {
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun multiply(x: Int, y: Int) = x * y

infix fun Int.times(y: Int) = this * y
infix fun String.onto(other: String) = Pair(this, other)

class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()

    infix fun likes(other: Person) {
        likedPeople.add(other)
    }
}

fun main() {
    printMessage("Hello")
    printMessageWithPrefix("Hello", "Log")
    printMessageWithPrefix("Hello")
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    println(sum(1, 2))
    println(multiply(2, 4))
    println(2 times 4)
    println("this" to "that")
    println("McLaren" onto "Lucas")

    val devan = Person("Devan")
    val gil = Person("Gil")
    devan likes gil
    println(devan.name)
    println(devan.likedPeople)
}