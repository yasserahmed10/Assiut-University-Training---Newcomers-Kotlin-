fun main() {
    val inputs = readln().split(" ")
    val num1=inputs[0].toInt()
    val operation=inputs[1]
    val num2=inputs[2].toInt()
    val sign=inputs[3]
    val num3=inputs[4].toInt()
    val result=when(operation){
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        else-> false
    }
    if (result==num3) {
        println("Yes")
    } else {
        println(result)
    }
}