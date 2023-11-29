fun main() {
    val numbers= readLine()!!.split(" ")
    val num1=numbers[0].toInt()
    val num2=numbers[1].toInt()
    if (num1>=num2)
    {
        println("Yes")
    }
    else
    {
        println("No")
    }
}