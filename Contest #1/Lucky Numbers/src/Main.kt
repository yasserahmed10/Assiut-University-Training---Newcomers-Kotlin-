fun main() {
    val input = readln()
    val num1 = input[0].toString().toInt()
    val num2 = input[1].toString().toInt()
    when {
        num1 == 0  && num2 != 0 -> print("YES")
        num2 == 0  && num1 != 0 -> print("YES")
        num1 == 0  && num2 == 0 -> print("NO")
        num1 % num2 == 0 || num2 % num1 == 0 -> print("YES")
        else -> print("NO")
    }
}