package NumberChallenges

fun main(args: Array<String>) {
    // How to print prime number in kotlin
    for (i in 2..100) {
        var isPrime: Boolean = true
        for (j in 1..i) {
            if (i % j === 0 && j !== 1 && j !== i) {
                isPrime = false
                break
            }
        }
        if (isPrime)
            println(i)
    }
}