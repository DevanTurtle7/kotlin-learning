package introduction

class MutableStack<E>(vararg items: E) {
    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)

    fun peek(): E = elements.last()

    fun pop() = elements.removeAt(elements.size - 1) // Return type E is inferred

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "MutableStack(${elements.joinToString()})"
}

fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements)

fun main() {
    val stack = MutableStack<Int>(1, 2, 3)
    stack.push(4)
    println(stack.peek())
    println(stack.pop())
    println(stack.isEmpty())
    println(stack.size().toString() + " elements long!")
    println(stack)

    val newStack = mutableStackOf(2.3, 0.23, 7.5)
    println(newStack)
}