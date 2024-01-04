fun main() {
    val n = readln().toInt()

    repeat(n) {
        val (s, t) = readln().split(" ")
        val minLength = minOf(s.length, t.length)
        val mergedStringBuilder = StringBuilder()

        for (i in 0..<minLength) {
            mergedStringBuilder.append(s[i])
            mergedStringBuilder.append(t[i])
        }

        when {
            s.length > t.length -> {
                mergedStringBuilder.append(s.substring(minLength))
            }
            t.length > s.length -> {
                mergedStringBuilder.append(t.substring(minLength))
            }
        }

        println(mergedStringBuilder.toString())
    }
}
