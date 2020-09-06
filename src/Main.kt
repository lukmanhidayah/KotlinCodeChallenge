import numberChallenges.MenuNumber
import arrayChalleges.MenuArray


fun main(args: Array<String>) {
    val menu = Menu(
        "Main Menu",
        listOf("Number Challenge", "Array Challenge"),
        "Exit"
    )
    do {
        println("------- Kotlin Code Challenge -------")
        menu.printMenu()
        val inputUser = readLine()
        when (inputUser) {
            "1" -> MenuNumber().printMenu()
            "2" -> MenuArray().printMenu()
        }
    } while (inputUser != "0")
}