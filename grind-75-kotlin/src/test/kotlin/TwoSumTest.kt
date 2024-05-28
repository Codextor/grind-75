import kotlin.test.Test
import kotlin.test.assertContentEquals

class TwoSumTest {

    @Test
    fun testTwoSum() {
        val testCases = listOf(
            Pair(Pair(intArrayOf(2, 7, 11, 15), 9), intArrayOf(0, 1)),
            Pair(Pair(intArrayOf(3, 2, 4), 6), intArrayOf(1, 2)),
            Pair(Pair(intArrayOf(3, 3), 6), intArrayOf(0, 1))
        )

        testCases.forEach { testCase ->
            val (input, expected) = testCase
            val (nums, target) = input
            assertContentEquals(expected, twoSum(nums, target))
        }
    }
}
