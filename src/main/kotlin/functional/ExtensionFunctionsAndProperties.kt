package functional

data class Item(val name: String, val price: Float)
data class Order(val items: Collection<Item>)

fun Order.maxPricedItemValue(): Float = this.items.maxByOrNull { it.price }?.price ?: 0F
fun Order.maxPricedItemName() = this.items.maxByOrNull { it.price }?.name ?: "NO_PRODUCTS"

val Order.commaDelimitedItemNames: String
    get() = items.map { it.name }.joinToString()

fun <T> T?.nullSafeToString() = this?.toString() ?: null

fun main() {
    val order = Order(listOf(Item("Bread", 25.0f), Item("Wine", 29.0f), Item("Water", 12.0f)))

    println("Max priced item name: ${order.maxPricedItemName()}")                           // 4
    println("Max priced item value: ${order.maxPricedItemValue()}")
    println("Items: ${order.commaDelimitedItemNames}")
}