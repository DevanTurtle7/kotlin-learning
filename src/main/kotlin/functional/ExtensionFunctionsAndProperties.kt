package functional

data class Item(val name: String, val price: Float)
data class Order(val items: Collection<Item>)