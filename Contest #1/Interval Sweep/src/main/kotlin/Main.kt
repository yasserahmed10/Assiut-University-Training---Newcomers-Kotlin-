fun main() {
    val inputs= readln().split(" ")
    val a=inputs[0].toInt()
    val b=inputs[1].toInt()
    if (a - b == 1 || b - a == 1 || (a == b && a != 0 && b != 0))
    {
         print("YES")
    }
    else print("NO")
}