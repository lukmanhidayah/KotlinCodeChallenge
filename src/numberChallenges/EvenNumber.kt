package numberChallenges

import InterfaceChallenge

// Write a program that prints the numbers from 1 to 100.
// print even number
class EvenNumber : InterfaceChallenge {
    override fun printChallenge() {
        for (i in 1..100) {
            if (i % 2 != 0) {
                println(i)
            }
        }
    }
}