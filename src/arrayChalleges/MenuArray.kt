package arrayChalleges

import menu.Menu
import menu.MenuInterface

class MenuArray: MenuInterface {
    override fun printMenu() {
        val menu = Menu(
            "Array challenges",
            listOf("Diagonal Multiplication", "Print Right Triangle"),
            "Back To menu.Menu"
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