fun main() {
    val numbers = readLine()!!.split(" ")
    val num1=numbers[0].toInt()
    val num2=numbers[1].toInt()
    if (num1.mod(num2)==0 || num2.mod(num1)==0){
        println("Multiples")
    }
    else
    {
        println("No Multiples")
    }
}