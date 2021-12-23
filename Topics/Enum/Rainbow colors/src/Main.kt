enum class Rainbow {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET;

    companion object {
        fun checkColor(color: String): Boolean {
            for (i in Rainbow.values()) {
                if (color.uppercase() == i.name) return true
            }
            return false
        }
    }
}

fun main() {
    val colorName = readLine()!!
    println(Rainbow.checkColor(colorName))
}