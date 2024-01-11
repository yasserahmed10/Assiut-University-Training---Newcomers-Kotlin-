fun main() {
    val url = readln()

    val parameters = url.split("?")[1].split("&")

    for (parameter in parameters) {
        val keyValue = parameter.split("=")
        val paramName = keyValue[0]
        val paramValue = keyValue[1]
        println("$paramName: $paramValue")
    }
}
