fun containsEven(collection: Collection<Int>): Boolean =
    collection.any { it % 2 == 0 }

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val result = containsEven(numbers)
    println(result)
}