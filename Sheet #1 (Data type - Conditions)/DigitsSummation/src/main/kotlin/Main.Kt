fun main() {
    val numbers= readLine()!!.split(" ")
    val num1=numbers[0].toLong()
    val num2=numbers[1].toLong()
    if (num1>9 && num2>9){
        println("${num1.mod(10)+num2.mod(10)}")

    }
}