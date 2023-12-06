fun main() {
    val inputs= readln()
    var input=inputs[0].toInt()
    if (inputs[0].toInt()==122) {
        input=97
        println(input.toChar())
    }
    else{
        println((input+1).toChar())
    }
}