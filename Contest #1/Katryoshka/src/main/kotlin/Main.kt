import kotlin.math.min
fun main() {
    val inputs= readln().split(" ")
    var eyes=inputs[0].toLong()
    var mouths=inputs[1].toLong()
    var bodies=inputs[2].toLong()
    var result :Long=0
   var min=minOf(eyes,mouths,bodies)
    result +=min
    eyes-=min
    mouths-=min
    bodies-=min
    min= minOf(eyes/2,bodies)
    result +=min
    println(result)


}

