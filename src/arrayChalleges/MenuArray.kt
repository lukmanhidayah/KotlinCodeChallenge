package arrayChalleges

import Menu
import MenuInterface

class MenuArray: MenuInterface {
    override fun printMenu() {
        val menu = Menu(
            "Array challenges",
            listOf("Diagonal Multiplication", "Print Right Triangle"),
            "Back To Menu"
        )
        do {
            menu.printMenu()
            val inputUser = readLine()
            when (inputUser) {
                "1" -> DiagonalMultiplication().printChallenge()
            }
        } while (inputUser != "0")
    }
}