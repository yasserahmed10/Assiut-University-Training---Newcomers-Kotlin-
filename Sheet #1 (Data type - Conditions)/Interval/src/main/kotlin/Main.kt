fun main() {
    val number= readln().toDouble()
    when {
        number in 0.0..25.00 -> println("Interval [0,25]")
        number>25 && number<=50 -> println("Interval (25,50]")
        number>50 && number<=75 -> println("Interval (50,75]")
        number>75 && number<=100 -> println("Interval (75,100]")
        else -> println("Out of Intervals")
    }
}