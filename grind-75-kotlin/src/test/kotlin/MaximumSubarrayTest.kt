import kotlin.test.Test
import kotlin.test.assertEquals

class MaximumSubarrayTest {

    @Test
    fun testMaxSubArray() {
        val testCases = listOf(
            Pair(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4), 6),
            Pair(intArrayOf(1), 1),
            Pair(intArrayOf(5, 4, -1, 7, 8), 23)
        )

        testCases.forEach { testCase ->
            val (nums, expected) = testCase
            assertEquals(expected, maxSubArray(nums))
        }
    }
}
