fun main() {
    val symbol = readln()
    val n = readln().toInt()
    val numbers = readln().split(" ").map { it.toInt() }

    for (number in numbers) {
        println(symbol.repeat(number))
    }
}
