fun main() {
    val inputs= readln().split(" ")
    val a=inputs[0].toLong()
    val b=inputs[1].toLong()
    val k=inputs[2].toLong()
    when {
        a%k== 0L && b%k== 0L -> {
            println("Both")
        }
        a%k== 0L && b%k!== 0L -> {
            println("Memo")
        }
        a%k!== 0L && b%k== 0L -> {
            println("Momo")
        }
        a%k!== 0L && b%k!== 0L -> {
            println("No One")
        }
    }
}