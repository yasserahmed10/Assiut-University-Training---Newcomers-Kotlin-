fun main() {
    val input = readln().split(" ").map { it.toInt() }
    var num1 = input[0]
    var num2 = input[1]

    while (num2 != 0) {
        val temp = num2
        num2 = num1 % num2
        num1 = temp
    }

    println(num1)
}
