fun main() {
    val input = readLine()!!.split(" ")
    val l1 = input[0].toInt()
    val r1 = input[1].toInt()
    val l2 = input[2].toInt()
    val r2 = input[3].toInt()

    if (l2 > r1 || r2 < l1) {
        println("-1")
    } else {
        println("${maxOf(l1, l2)} ${minOf(r1, r2)}")
    }
}
