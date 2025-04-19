import kotlin.test.Test
import kotlin.test.assertEquals

class PartitionEqualSubsetSumTest {

    @Test
    fun testCanPartition() {
        val testCases = listOf(
            Pair(intArrayOf(1, 5, 11, 5), true),
            Pair(intArrayOf(1, 2, 3, 5), false)
        )

        testCases.forEach { testCase ->
            val (nums, expected) = testCase
            assertEquals(expected, canPartition(nums))
        }
    }
}
