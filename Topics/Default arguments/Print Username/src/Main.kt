fun main() {
    val name = readLine()!!
    fun greetings(name: String) {
        val userName = if (name == "HIDDEN") "secret user" else name
        println("Hello, $userName!")
    }
    greetings(name)
}