fun main() {
  when(readLine()!!.first()){
    in '0'..'9'-> println("IS DIGIT")
    in 'A'..'Z'-> println("ALPHA\nIS CAPITAL")
    in 'a'..'z'-> println("ALPHA\nIS SMALL")
  }
}
                       // second way
//fun main() {
//  val input = readLine()!!.first() // Read the first character from the input line
//
//  when {
//    input.isDigit() -> println("IS DIGIT")
//    input.isUpperCase() -> println("ALPHA\nIS CAPITAL")
//    input.isLowerCase() -> println("ALPHA\nIS SMALL")
//  }
//}


