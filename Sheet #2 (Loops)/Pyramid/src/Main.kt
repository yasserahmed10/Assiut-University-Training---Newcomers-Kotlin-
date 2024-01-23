fun main() {
    val number = readln().toInt()

    for (i in 1..number) {
        repeat(i) {
            print("*")
        }
        println()
    }
}
