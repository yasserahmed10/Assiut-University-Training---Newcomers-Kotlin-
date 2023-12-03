fun main() {
    val input = readLine()!!.split(" ")
    val x = input[0].toDouble()
    val y = input[1].toDouble()

    when {
        x > 0 && y > 0 -> println("Q1")
        x < 0 && y > 0 -> println("Q2")
        x < 0 && y < 0 -> println("Q3")
        x > 0 && y < 0 -> println("Q4")
        x == 0.0 && y != 0.0 -> println("Eixo Y")
        x != 0.0 && y == 0.0 -> println("Eixo X")
        x == 0.0 && y == 0.0 -> println("Origem")
    }
}
