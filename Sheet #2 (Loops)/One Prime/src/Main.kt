fun main() {
    val number = readln().toInt()

    when {
        number < 2 -> {
            println("NO")
        }
        else -> {
            var isPrime = true
            for (i in 2..<number) {
                when {
                    number % i == 0 -> {
                        isPrime = false
                        break
                    }
                }
            }

            when {
                isPrime -> {
                    println("YES")
                }
                else -> {
                    println("NO")
                }
            }
        }
    }
}
