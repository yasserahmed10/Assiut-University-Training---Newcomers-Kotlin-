fun main() {
    val n = readln().toInt()

    if (n >= 1) {
        print("0")
    }
    if (n >= 2) {
        print(" 1")
    }

    var a = 0
    var b = 1

    for (i in 3..n) {
        val next = a + b
        print(" $next")
        a = b
        b = next
    }
}
