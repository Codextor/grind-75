import kotlin.test.Test
import kotlin.test.assertEquals

class SubarraySumEqualsKTest {

    @Test
    fun testSubarraySum() {
        val testCases = listOf(
            Triple(intArrayOf(1, 1, 1), 2, 2),
            Triple(intArrayOf(1, 2, 3), 3, 2)
        )

        testCases.forEach { testCase ->
            val (nums, k, expected) = testCase
            assertEquals(expected, subarraySum(nums, k))
        }
    }
}
