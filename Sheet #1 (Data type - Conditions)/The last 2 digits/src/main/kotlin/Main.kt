fun main() {
    val inputs = readLine()!!.split(" ")
    var num1 = inputs[0].toInt()
    var num2 = inputs[1].toInt()
    var num3 = inputs[2].toInt()
    var num4 = inputs[3].toInt()

    num1 %= 100
    num2 %= 100
    num3 %= 100
    num4 %= 100

    val multiplication = num1 * num2 * num3 * num4

    if (multiplication % 100 <= 9) {
        println("0${multiplication % 100}")
    } else {
        println(multiplication % 100)
    }
}