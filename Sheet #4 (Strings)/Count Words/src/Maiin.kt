fun main() {
    val input = readln()

    val separators = setOf(' ', '!', '.', '?', ',')

    var wordCount = 0
    var isWord = false

    for (char in input) {
        when {
            char in separators -> {
                isWord = false
            }
            !isWord -> {
                isWord = true
                wordCount++
            }
        }
    }

    println(wordCount)
}
