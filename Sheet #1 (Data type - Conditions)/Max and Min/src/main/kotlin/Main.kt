//import kotlin.math.max
fun main() {
    val numbers= readLine()!!.split(" ")
    val num1=numbers[0].toInt()
    val num2=numbers[1].toInt()
    val num3=numbers[2].toInt()
    println("${minOf(num1,num2,num3)} ${maxOf(num1,num2,num3)}")
}