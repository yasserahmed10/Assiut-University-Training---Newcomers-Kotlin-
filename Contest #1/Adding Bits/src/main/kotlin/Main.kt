fun main() {
    val inputs= readln().split(" ")
    val num1=inputs[0].toInt()
    val num2=inputs[1].toInt()
    println(num1.xor(num2))
}