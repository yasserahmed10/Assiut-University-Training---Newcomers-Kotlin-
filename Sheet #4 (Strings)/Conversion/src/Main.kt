fun main() {
    val input = readln()
    val result = StringBuilder()

    for (char in input) {
        when {
            char == ',' -> result.append(' ')
            char.isUpperCase() -> result.append(char.toLowerCase())
            char.isLowerCase() -> result.append(char.toUpperCase())
            else -> result.append(char)
        }
    }

    println(result.toString())
}
