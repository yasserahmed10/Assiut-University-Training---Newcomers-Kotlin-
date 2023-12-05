fun main() {
    val inputs = readLine()!!.split(" ")
    val num1 = inputs[0].toInt()
    val operation = inputs[1]
    val num2 = inputs[2].toInt()

    val result = when (operation) {
        "<" -> num1 < num2
        ">" -> num1 > num2
        "=" -> num1 == num2
        else -> false
    }

    if (result) {
        println("Right")
    } else {
        println("Wrong")
    }
}
