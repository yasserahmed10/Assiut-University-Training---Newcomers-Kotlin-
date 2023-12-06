fun main() {
    val inputs= readln().split(" ")
    val a=inputs[0].toLong()
    val b=inputs[1].toLong()
    val c=inputs[2].toLong()
    val d=inputs[3].toLong()
    when (d) {
        a+b-c-> println("YES")
        a+b*c -> println("YES")
        a-b*c -> println("YES")
        a-b+c-> println("YES")
        a*b+c-> println("YES")
        a*b-c -> println("YES")
        else -> println("NO")
    }
}