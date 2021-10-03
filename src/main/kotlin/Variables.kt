fun main() {
    var a: String = "initial" // Var is mutable
    val b: Int = 1 // val is immutable
    val c = 3 // Int is inferred
    val e: Boolean = true

    val d: Int

    if (e) {
        d = 1
    } else {
        d = 2
    }

    println(d)

    val f: Int = if (e) {
        0
    } else {
        1
    }

    println(f)
}