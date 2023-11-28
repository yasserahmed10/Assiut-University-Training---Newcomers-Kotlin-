import kotlin.math.PI
import kotlin.math.pow
fun main() {
   val r = readLine()!!.toDouble()
    val area= PI*r.pow(2)
    println("%.9f".format(area))
}