fun main() {
    val (num1, num2) = readln().split(" ").map { it.toInt() }

    var foundLuckyNumber = false

    for (i in num1..num2) {
        val isLucky = i.toString().all { it == '4' || it == '7' }
        if (isLucky) {
            print("$i ")
            foundLuckyNumber = true
        }
    }

    if (!foundLuckyNumber) {
        println("-1")
    }
}
