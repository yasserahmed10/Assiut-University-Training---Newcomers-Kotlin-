fun main() {
    val n = readln().toLong()

    val reversedN = n.toString().reversed().toLong()
    println(reversedN)

    if (n == reversedN) {
        println("YES")
    } else {
        println("NO")
    }
}
