package arrayChalleges

import InterfaceChallenge

// Create array of integer contain two row and two column
// multiplication diagonal of array and sum every result multiplication
// example:
// [1, 2, 3]
// [1, 2, 3]
// [1, 2, 3]
// (1 * 4) + (2 * 3) = ....
class DiagonalMultiplication : InterfaceChallenge {
    fun multiDiagonal(arr: List<List<Int>>) {
        println("range array ${arr.indices}")
        var diagonal1: Int = 1;
        var diagonal2: Int = 1
        for (i in arr.indices) {
            for (j in arr[i].indices) {
                if (i == j && j + i == arr.size - 1) {
                    diagonal1 *= arr[i][j]
                    diagonal2 *= arr[i][j]
                } else if (i == j) {
                    diagonal1 *= arr[i][j]
                } else if (j + i == arr.size - 1) {
                    diagonal2 *= arr[i][j]
                }
            }
        }
        println("left side: $diagonal1")
        println("right side: $diagonal2")
        println("SumDiagonal: ${diagonal1 + diagonal2}")
    }

    override fun printChallenge() {
        val arr = listOf(listOf(2, 2, 3), listOf(3, 4, 5), listOf(3, 4, 5))
        val arr2 = listOf(listOf(2, 2), listOf(3, 4))
        println("Appearance Array1: ")
        multiDiagonal(arr)
        println("Appearance Array2: ")
        multiDiagonal(arr2)
    }
}