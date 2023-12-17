fun main() {
    val n = readln().toInt()
    val numbers = readln().split(" ").map { it.toInt() }

    val maxNumber = numbers.maxOrNull()

    println(maxNumber)
}
// In another way
//fun main() {
//    val n = readln().toInt()
//    val numbers = readln().split(" ").map { it.toInt() }
//
//    var maxNumber = Int.MIN_VALUE
//
//    for (i in 0..<n) {
//        if (numbers[i] > maxNumber) {
//            maxNumber = numbers[i]
//        }
//    }
//
//    println(maxNumber)
//}
