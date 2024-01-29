fun main() {
    val n = readln().toInt()

    for (i in 1..n) {
        repeat(n - i) { print(" ") }
        repeat(2 * i - 1) { print("*") }
        println()
    }

    for (i in n downTo 1) {
        repeat(n - i) { print(" ") }
        repeat(2 * i - 1) { print("*") }
        println()
    }
}