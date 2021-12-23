class City(val name: String) {
    var degrees: Int = 0
        set(value) {
            if (value < -92 || value > 57) {
                when (name) {
                    "Moscow" -> field = 5
                    "Hanoi" -> field = 20
                    "Dubai" -> field = 30
                }
            } else field = value
        }
}

fun main() {
    val first = readLine()!!.toInt()
    val second = readLine()!!.toInt()
    val third = readLine()!!.toInt()
    val firstCity = City("Dubai")
    firstCity.degrees = first
    val secondCity = City("Moscow")
    secondCity.degrees = second
    val thirdCity = City("Hanoi")
    thirdCity.degrees = third
    if (first == second || first == third || second == third) {
        println("neither")
    } else {
        if (firstCity.degrees < secondCity.degrees && firstCity.degrees < thirdCity.degrees) println(firstCity.name)
        if (secondCity.degrees < firstCity.degrees && secondCity.degrees < thirdCity.degrees) println(secondCity.name)
        if (thirdCity.degrees < secondCity.degrees && thirdCity.degrees < firstCity.degrees) println(thirdCity.name)
    }
}