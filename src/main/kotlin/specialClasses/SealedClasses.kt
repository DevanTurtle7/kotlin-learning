package specialClasses

// Sealed restricts inheritance, unless the inheriting class is in the same package
sealed class Mammal(val name: String)

class Cat(val catName: String): Mammal(catName)
class Human(val humanName: String, val job: String): Mammal(humanName)

fun greetMammal(mammal: Mammal): String {
    when (mammal) {
        is Cat -> return "Hello ${mammal.name}"
        is Human -> return "Hello ${mammal.name}; You're working as a ${mammal.job}"
        // Else is not required because the class is sealed and all possible subclasses have been covered
    }
}

fun main() {
    println(greetMammal(Cat("Snowy")))
    println(greetMammal(Human("Devan", "Student")))
    //println(greetMammal(Mammal("Test"))) // Sealed classes cannot be instantiated
}