import kotlin.test.Test
import kotlin.test.assertEquals

class SearchInRotatedSortedArrayTest {

    @Test
    fun testSearchInRotatedSortedArray() {
        val testCases = listOf(
            Triple(intArrayOf(4, 5, 6, 7, 0, 1, 2), 0, 4),
            Triple(intArrayOf(4, 5, 6, 7, 0, 1, 2), 3, -1),
            Triple(intArrayOf(1), 0, -1)
        )

        testCases.forEach { testCase ->
            val (nums, target, expected) = testCase
            assertEquals(expected, searchInRotatedSortedArray(nums, target))
        }
    }
}
