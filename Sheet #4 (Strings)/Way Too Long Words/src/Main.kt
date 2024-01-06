fun main() {
    val t = readln().toInt()

    repeat(t) {
        val s = readln()
        val result = if (s.length > 10) {
            "${s[0]}${s.length - 2}${s.last()}"
        } else {
            s
        }
        println(result)
    }
}
