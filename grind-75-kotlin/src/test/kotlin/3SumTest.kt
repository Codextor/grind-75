import kotlin.test.Test
import kotlin.test.assertEquals

class `3SumTest` {

    @Test
    fun testThreeSum() {
        val testCases = listOf(
            Pair(intArrayOf(-1, 0, 1, 2, -1, -4), listOf(listOf(-1, -1, 2), listOf(-1, 0, 1))),
            Pair(intArrayOf(0, 1, 1), listOf()),
            Pair(intArrayOf(0, 0, 0), listOf(listOf(0, 0, 0)))
        )

        testCases.forEach { testCase ->
            val (input, expected) = testCase
            assertEquals(expected, threeSum(input))
        }
    }
}
