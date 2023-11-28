fun main() {
    val numbers = readLine()!!.split(" ")
    val num1 = numbers[0].toLong()
    val num2 = numbers[1].toLong()
    val sum = num1.plus(num2)
    val multi = num1.times(num2)
    val sub = num1.minus(num2)
    println("$num1 + $num2 = $sum" )
    println("$num1 * $num2 = $multi" )
    println("$num1 - $num2 = $sub" )
}
