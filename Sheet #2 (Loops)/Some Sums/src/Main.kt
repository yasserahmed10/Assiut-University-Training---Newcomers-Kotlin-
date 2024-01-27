fun main() {
    val input = readln().split(" ").map { it.toInt() }
    val num1 = input[0]
    val num2 = input[1]
    val num3 = input[2]

    var result = 0

    for (i in 1..num1) {
        var n = i
        var sumOfDigits = 0

        while (n > 0) {
            sumOfDigits += n % 10
            n /= 10
        }

        if (sumOfDigits in num2..num3) {
            result += i
        }
    }

    println(result)
}
