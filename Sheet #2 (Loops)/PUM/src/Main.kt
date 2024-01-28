fun main() {
    val n = readln().toInt()

    var start = 1
    for (i in 1..n) {
        val end = start + 2
        println("$start ${start + 1} $end PUM")
        start = end + 2
    }
}
