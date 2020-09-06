package numberChallenges

import InterfaceChallenge

// Write a program that prints the numbers from 1 to 100.
// print odd number in kotlin
class OddNumber : InterfaceChallenge {
    override fun printChallenge() {
        for (i in 1..100) {
            if (i % 2 == 0) {
                println(i)
            }
        }
    }
}
