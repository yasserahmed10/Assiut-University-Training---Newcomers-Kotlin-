fun main() {
    val n = readln().toInt()
    val numbers = readln().split(" ").map { it.toInt() }

    var evenNumber = 0
    var oddNumber = 0
    var positiveNumber = 0
    var negativeNumber = 0

    for (number in numbers) {
        if (number % 2 == 0) {
            evenNumber++
        } else {
            oddNumber++
        }

        if (number > 0) {
            positiveNumber++
        } else if (number < 0) {
            negativeNumber++
        }
    }

    println("Even: $evenNumber")
    println("Odd: $oddNumber")
    println("Positive: $positiveNumber")
    println("Negative: $negativeNumber")
}
