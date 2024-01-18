fun main() {
    val number = readln().toInt()

    if (number >= 2) {
        for (i in 2..number) {
            var isPrime = true

            for (j in 2..<i) {
                if (i % j == 0) {
                    isPrime = false
                    break
                }
            }

            if (isPrime) {
                print("$i ")
            }
        }
    }
}
