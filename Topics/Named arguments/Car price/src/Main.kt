fun carPrice(old: Int = 5, kilometers: Int = 100000, maximumSpeed: Int = 120, automatic: Boolean = false): Int {
    val oldPrice = old * 2000
    val kilometersPrice = kilometers / 10000 * 200
    val speedPrice = (120 - maximumSpeed) * 100
    val automaticPrice = if (automatic) 1500 else 0
    val totalPrice = 20000 - oldPrice - kilometersPrice - speedPrice + automaticPrice
    println(totalPrice)
    return totalPrice
}
