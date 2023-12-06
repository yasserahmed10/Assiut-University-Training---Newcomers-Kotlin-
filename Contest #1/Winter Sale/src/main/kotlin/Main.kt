fun main() {
    val inputs= readln().split(" ")
    val x=inputs[0].toDouble()
    val p=inputs[1].toDouble()
    val originalPrice=p/(1-(x/100))
    println("%.2f".format(originalPrice))

}