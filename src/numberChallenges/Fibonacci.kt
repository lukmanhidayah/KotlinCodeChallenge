package numberChallenges

import InterfaceChallenge

/*
* Write number from 1 to 100
* print fibonacci number
* fibonacci formulas is n = (n-2) + (n-1)
* */
class Fibonacci : InterfaceChallenge {
    override fun printChallenge() {
        var i = 1

        var prevNumber = 0
        var curNumber = 1
        print("Fibonacci (0 - 100): ")
        while (prevNumber <= 100) {
            print("$prevNumber ")
            val nextNumber = curNumber + prevNumber
            prevNumber = curNumber
            curNumber = nextNumber
        }
        println()
    }
}

