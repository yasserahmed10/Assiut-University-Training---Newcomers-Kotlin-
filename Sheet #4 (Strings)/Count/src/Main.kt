fun main() {
    val input = readlnOrNull() ?: ""
    var sum = 0
    for (char in input) {
        sum += char.toString().toInt()
    }
    println(sum)
}