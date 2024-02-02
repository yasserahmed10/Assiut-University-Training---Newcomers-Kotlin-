fun main() {
    val t = readln().toInt()
    repeat(t) {
        val (x, y) = readln().split(" ").map { it.toInt() }
        var sum = 0
        when {
            x < y -> {
                for (i in x + 1..<y) {
                    when {
                        i % 2 != 0 -> {
                            sum += i
                        }
                    }
                }
            }
            else -> {
                for (i in y + 1..<x) {
                    when {
                        i % 2 != 0 -> {
                            sum += i
                        }
                    }
                }
            }
        }
        println(sum)
    }
}