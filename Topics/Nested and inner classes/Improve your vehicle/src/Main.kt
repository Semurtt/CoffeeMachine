class Vehicle(name: String) {
    val name = name

    inner class Engine(horsePower: Int) {
        val horsePower = horsePower

        fun start() {
            println("RRRrrrrrrr....")
        }

        fun printHorsePower() {
            println("The $name vehicle has $horsePower horsepower.")
        }
    }
}