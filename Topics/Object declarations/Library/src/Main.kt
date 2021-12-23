object Math {
    fun abs(a: Int): Int {
        return if (a >= 0) a else -a
    }

    fun abs(b: Double): Double {
        return if (b >= 0) b else -b
    }
}