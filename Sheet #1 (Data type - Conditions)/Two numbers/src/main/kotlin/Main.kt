import java.lang.Math.ceil
import kotlin.math.floor
import kotlin.math.roundToInt
fun main() {
    val numbers= readLine()!!.split(" ")
    val num1=numbers[0].toInt()
    val num2=numbers[1].toInt()
    val floor = floor((num1.toDouble()/num2))
    println("floor $num1 / $num2 = ${floor.toInt()}")
    val ceil = ceil((num1.toDouble()/num2))
    println("ceil $num1 / $num2 = ${ceil.toInt()}")
    val round= (num1.toDouble() / num2).roundToInt()
    println("round $num1 / $num2 = $round")
}

