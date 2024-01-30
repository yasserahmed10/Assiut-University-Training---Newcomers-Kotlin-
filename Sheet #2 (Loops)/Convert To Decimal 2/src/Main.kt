fun main() {
    val t = readln().toInt()

    repeat(t) {
        val n = readln().toInt()
        var binaryRepresentation = ""
        var num = n

        while (num > 0) {
            val remainder = num % 2
            binaryRepresentation = remainder.toString() + binaryRepresentation
            num /= 2
        }

        val countOnes = binaryRepresentation.count { it == '1' }
        val result = Integer.parseInt("1".repeat(countOnes), 2)
        println(result)
    }
}
