package introduction

class Customer

class Contact(val id: Int, var email: String)

class Multiplier(x: Int, y: Int) {
    val sum = x * y
}

class PrivMultiplier(x: Int, y: Int) {
    private val sum = x * y
}

class PrivContact(private val id: Int, private var email: String)


fun main() {
    val customer = Customer()
    val contact = Contact(1, "mary@gmail.com")
    println(contact.id)
    println(contact.email)
    contact.email = "jane@gmail.com"
    println(contact.email)

    val mult = Multiplier(2, 3)
    println(mult.sum)
    val privMult = PrivMultiplier(2, 3)
    //println(privMult.sum)

    val privContact = PrivContact(2, "devan@gmail.com")
    //println(privContact.id)
    //println(privContact.email)
}