import kotlin.test.Test
import kotlin.test.assertEquals

class LongestIncreasingSubsequenceTest {

    @Test
    fun testLengthOfLIS() {
        val testCases = listOf(
            Pair(intArrayOf(10, 9, 2, 5, 3, 7, 101, 18), 4),
            Pair(intArrayOf(0, 1, 0, 3, 2, 3), 4),
            Pair(intArrayOf(7, 7, 7, 7, 7, 7, 7), 1)
        )

        testCases.forEach { testCase ->
            val (nums, expected) = testCase
            assertEquals(expected, lengthOfLIS(nums))
        }
    }
}
