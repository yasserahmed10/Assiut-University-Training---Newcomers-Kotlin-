fun main() {
    val q = readln().toInt()
    val s = readln()

    val key = "PgEfTYaWGHjDAmxQqFLRpCJBownyUKZXkbvzIdshurMilNSVOtec#@_!=.+-*/"
    val original = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"

    if (q == 1) {
        val encrypted = s.map {
            val index = original.indexOf(it)
            key[index].toString()
        }.joinToString("")
        println(encrypted)
    } else {
        val decrypted = s.map {
            val index = key.indexOf(it)
            original[index].toString()
        }.joinToString("")
        println(decrypted)
    }
}
