fun main() {
    val inputString = readln()

    val reversedStr = inputString.reversed()

    if (inputString == reversedStr) {
        println("YES")
    } else {
        println("NO")
    }
}
