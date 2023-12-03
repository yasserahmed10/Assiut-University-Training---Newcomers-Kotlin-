fun main() {
    val number = readLine()!!.toInt()

    val years = number / 365
    val months = (number % 365) / 30
    val days = (number % 365) % 30

    println("$years years")
    println("$months months")
    println("$days days")
}
