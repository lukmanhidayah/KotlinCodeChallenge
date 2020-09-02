package numberChallenges

fun main(args: Array<String>) {
    /*
    * Write a program that prints the numbers from 1 to 100.
    * But for multiples of three print “Fizz”
    * instead of the number and for the multiples of five print “Buzz”.
    * For numbers which are multiples of both three and five print “FizzBuzz"
    */
    var multi3 = 3
    var multi5 = 5
    for (i in 1..100) {
        if (i === multi3 && i === multi5) {
            println("FizzBuzz")
            multi3 += 3
            multi5 += 5
        } else if (i === multi3) {
            println("Fizz")
            multi3 += 3
        } else if (i === multi5) {
            println("Buzz")
            multi5 += 5
        }

    }
}