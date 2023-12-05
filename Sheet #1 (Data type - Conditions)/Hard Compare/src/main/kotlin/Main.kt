import kotlin.math.ln

fun main() {
    val inputs= readln().split(" ")
    val num1=inputs[0].toDouble()
    val num2=inputs[1].toDouble()
    val num3=inputs[2].toDouble()
    val num4=inputs[3].toDouble()
    if (num2* ln(num1) >num4* ln(num3))
    {
       println("YES")
    }
    else
        println("NO")
}