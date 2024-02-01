fun main() {
    val (k, s) = readln().split(" ").map { it.toInt() }
    var count = 0

    for (x in 0..k) {
        for (y in 0..k) {
            val z = s - x - y
            if (z in 0..k) {
                count++
            }
        }
    }

    println(count)
}
