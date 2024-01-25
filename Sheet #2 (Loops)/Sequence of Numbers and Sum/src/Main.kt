fun main() {
    while (true) {
        val (n, m) = readln().split(" ").map { it.toInt() }

        if (n <= 0 || m <= 0) {
            break
        }

        val range = if (n <= m) n..m else m..n
        val numbers = range.joinToString(" ")
        val sum = range.sum()

        println("$numbers sum =$sum")
    }
}