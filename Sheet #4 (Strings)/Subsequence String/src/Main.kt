fun main() {
    val s = readln()
    val target = "hello"
    var j = 0

    for (char in s) {
        if (j < target.length && char == target[j]) {
            j++
        }
    }

    val result = if (j == target.length) "YES" else "NO"
    println(result)
}
