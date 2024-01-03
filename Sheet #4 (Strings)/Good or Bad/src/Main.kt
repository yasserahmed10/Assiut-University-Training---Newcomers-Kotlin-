fun main() {
    val t = readln().toInt()

    repeat(t) {
        val s = readln()

        if (s.contains("010") || s.contains("101")) {
            println("Good")
        } else {
            println("Bad")
        }
    }
}
