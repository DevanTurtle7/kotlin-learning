package controlFlow

fun main() {
    /**
     * == : Structural comparison
     * === : Referential comparison
     */
    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val authors2 = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers) // true; Calls authors.equals(writers)
    println(authors === writers) // false; Because authors and writers are different objects
    println(authors === authors2) // false; Because authors and authors2 are different objects
}