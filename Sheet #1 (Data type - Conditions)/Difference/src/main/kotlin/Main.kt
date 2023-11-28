fun main() {
    val numbers = readLine()!!.split(" ")

    val a=numbers[0].toLong()
    val b=numbers[1].toLong()
    val c=numbers[2].toLong()
    val d=numbers[3].toLong()
    val Difference= (a*b)-(c*d)
    println("Difference = $Difference")
}