fun main() {
    val number = readln().toInt()

    for (i in number downTo 1) {
        repeat(i) {
            print("*")
        }
        println()
    }
}
