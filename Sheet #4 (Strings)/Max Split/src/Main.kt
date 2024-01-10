fun main() {
    val input = readln()
    var balance = 0
    var currentString = ""
    val result = mutableListOf<String>()

    for (char in input) {
        currentString += char
        if (char == 'L') {
            balance++
        } else {
            balance--
        }

        if (balance == 0) {
            result.add(currentString)
            currentString = ""
        }
    }

    println(result.size)
    result.forEach { println(it) }
}