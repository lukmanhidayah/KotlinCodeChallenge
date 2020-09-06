package numberChallenges

import menu.Menu
import menu.MenuInterface

class MenuNumber : MenuInterface {
    override fun printMenu() {
        val menu = Menu(
            "Number challenge",
            listOf("Even Number", "Odd Number", "Fizz Buzz", "Prime Number", "Fibonacci Number"),
            "Back To menu.Menu"
        )
        do {
            menu.printMenu()
            val inputUser = readLine()
            when (inputUser) {
                "1" -> EvenNumber().printChallenge()
                "2" -> OddNumber().printChallenge()
                "3" -> FizzBuzz().printChallenge()
                "4" -> PrimeNumber().printChallenge()
                "5" -> Fibonacci().printChallenge()
            }
        } while (inputUser != "0")
    }
}