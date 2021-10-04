package controlFlow

fun eatACake() = println("Eat a Cake")
fun bakeACake() = println("Bake a Cake")

fun main() {
    val cakes = listOf("carrot", "cheese", "chocolate")

    for (cake in cakes) {
        println("Yummy, it's a $cake cake!")
    }

    var cakesEaten = 0
    var cakesBaked = 0

    while (cakesEaten < 5) {
        eatACake()
        cakesEaten++
    }

    // The difference is that the do-while executes the block first and then checks the condition
    do {
        bakeACake()
        cakesBaked++
    } while (cakesBaked < cakesEaten)
}