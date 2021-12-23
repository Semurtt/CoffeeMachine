enum class Rainbow {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET;

    companion object {
        fun isRainbow(color: String): Int {
            for (colors in Rainbow.values()) {
                if (color.uppercase() == colors.name) return colors.ordinal + 1
            }
            return 0
        }
    }
}

fun main() {
    val color = readLine()!!
    println(Rainbow.isRainbow(color))
    // println(Rainbow.valueOf(color.uppercase()).ordinal + 1)
}