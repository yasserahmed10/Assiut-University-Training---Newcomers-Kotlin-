fun main() {
    val inputs = readLine()!!
    val num1 = inputs.substring(0, 1).toInt()
    val operation = inputs[1]
    val num2 = inputs.substring(2).toInt()

    when (operation) {
        '+' -> println(num1 + num2)
        '/' -> println(num1 / num2)
        '*' -> println(num1 * num2)
        '-' -> println(num1 - num2)

    }
}


