import kotlin.test.Test
import kotlin.test.assertContentEquals

class SortColorsTest {

    @Test
    fun testSortColors() {
        val testCases = listOf(
            Pair(intArrayOf(2, 0, 2, 1, 1, 0), intArrayOf(0, 0, 1, 1, 2, 2)),
            Pair(intArrayOf(2, 0, 1), intArrayOf(0, 1, 2))
        )

        testCases.forEach { testCase ->
            val (nums, expected) = testCase
            sortColors(nums)
            assertContentEquals(expected, nums)
        }
    }
}
