import kotlin.math.PI
fun main() {
    val r = readLine()!!.toDouble()
    val area = PI*r*r
    println("%.9f".format(area))
}