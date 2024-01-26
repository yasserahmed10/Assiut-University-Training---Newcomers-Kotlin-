fun main() {
    val n = readln().toInt()

    for (i in 1..n) {
        for (j in 1..n - i) {
            print(" ")
        }

        for (k in 1..<2 * i) {
            print("*")
        }

        println()
    }
}
