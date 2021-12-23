package machine

var water: Int = 400
var milk: Int = 540
var coffee: Int = 120
var cups: Int = 9
var money: Int = 550
const val espressoPrice: Int = 4
const val lattePrice: Int = 7
const val cappuccinoPrice: Int = 6


class CoffeeMachine {


    fun start() {
        do {
            println("\nWrite action (buy, fill, take, remaining, exit):")
            val n = readLine()!!
            when (n) {
                "buy" -> buyCoffee()
                "fill" -> fillMachine()
                "take" -> takeMoney()
                "remaining" -> remaining()
            }
        } while (n != "exit")
    }

    private fun remaining() {
        println("\nThe coffee machine has:")
        println("$water of water")
        println("$milk of milk")
        println("$coffee of coffee beans")
        println("$cups of disposable cups")
        println("$money of money")
    }

    private fun buyCoffee() {
        println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:")
        val buy = readLine()!!
        when {
            buy == "back" -> return
            buy.toInt() == 1 -> {
                if (water < 250) println("Sorry, not enough water!")
                else if (coffee < 16) println("Sorry, not enough coffee!")
                else if (cups < 1) println("Sorry, not enough cups!")
                else {
                    water -= 250
                    coffee -= 16
                    cups--
                    money += espressoPrice
                    println("I have enough resources, making you a coffee!")
                }
            }
            buy.toInt() == 2 -> {
                if (water < 350) println("Sorry, not enough water!")
                else if (milk < 75) println("Sorry, not enough milk!")
                else if (coffee < 20) println("Sorry, not enough coffee!")
                else if (cups < 1) println("Sorry, not enough cups!")
                else {
                    water -= 350
                    milk -= 75
                    coffee -= 20
                    cups--
                    money += lattePrice
                    println("I have enough resources, making you a coffee!")
                }
            }
            buy.toInt() == 3 -> {
                if (water < 200) println("Sorry, not enough water!")
                else if (milk < 100) println("Sorry, not enough milk!")
                else if (coffee < 12) println("Sorry, not enough coffee!")
                else if (cups < 1) println("Sorry, not enough cups!")
                else {
                    water -= 200
                    milk -= 100
                    coffee -= 12
                    cups--
                    money += cappuccinoPrice
                    println("I have enough resources, making you a coffee!")
                }
            }
        }
    }

    private fun fillMachine() {
        println("\nWrite how many ml of water do you want to add:")
        water += readLine()!!.toInt()
        println("Write how many ml of milk do you want to add:")
        milk += readLine()!!.toInt()
        println("Write how many grams of coffee beans do you want to add:")
        coffee += readLine()!!.toInt()
        println("Write how many disposable cups of coffee do you want to add:")
        cups += readLine()!!.toInt()
    }

    private fun takeMoney() {
        println("\nI gave you $$money")
        money = 0
    }

}