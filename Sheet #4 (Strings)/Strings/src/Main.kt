fun main() {
    val string1 = readln()
    val string2 = readln()
    println("${string1.length} ${string2.length}")
    println("$string1$string2")
    println("${string2[0]}${string1.substring(1)} ${string1[0]}${string2.substring(1)}")
}
