fun main() {
    val input = readln().uppercase()
    val targetWord = "EGYPT"
    val targetWordCounts = targetWord.groupingBy { it }.eachCount()

    val inputCounts = input.groupingBy { it }.eachCount()

    var minOccurrences = Int.MAX_VALUE
    for ((char, count) in targetWordCounts) {
        val inputCharCount = inputCounts[char] ?: 0
        val occurrences = inputCharCount / count
        if (occurrences < minOccurrences) {
            minOccurrences = occurrences
        }
    }

    println(minOccurrences)
}
