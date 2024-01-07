fun main() {
    val s = readln()

    val counts = IntArray(26)

    for (char in s) {
        counts[char - 'a']++
    }

    for (i in 0..<26) {
        val count = counts[i]
        if (count > 0) {
            val char = (i + 'a'.code).toChar()
            println("$char : $count")
        }
    }
}
