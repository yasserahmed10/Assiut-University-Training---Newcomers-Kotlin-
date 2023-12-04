fun main() {
    // Input the number
    val input = readLine()!!.toDouble()

    // Check if the number is an integer
    if (input.toInt().toDouble() == input) {
        println("int ${input.toInt()}")
    } else {
        val integerPart = input.toInt()
        val decimalPart = input - integerPart
        println("float $integerPart ${"%.3f".format(decimalPart)}")
    }
}
