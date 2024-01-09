fun main() {
    val input = readlnOrNull() ?: ""

    val reversedWords = input.split(" ").joinToString(" ") { it.reversed() }

    println(reversedWords)
}