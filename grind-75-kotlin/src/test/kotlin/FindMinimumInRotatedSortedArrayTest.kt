import kotlin.test.Test
import kotlin.test.assertEquals

class FindMinimumInRotatedSortedArrayTest {

    @Test
    fun testFindMin() {
        val testCases = listOf(
            Pair(intArrayOf(3, 4, 5, 1, 2), 1),
            Pair(intArrayOf(4, 5, 6, 7, 0, 1, 2), 0),
            Pair(intArrayOf(11, 13, 15, 17), 11)
        )

        testCases.forEach { testCase ->
            val (nums, expected) = testCase
            assertEquals(expected, findMin(nums))
        }
    }
}
