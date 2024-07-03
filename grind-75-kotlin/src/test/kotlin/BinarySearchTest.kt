import kotlin.test.Test
import kotlin.test.assertEquals

class BinarySearchTest {

    @Test
    fun testSearch() {
        val testCases = listOf(
            Pair(Pair(intArrayOf(-1, 0, 3, 5, 9, 12), 9), 4),
            Pair(Pair(intArrayOf(-1, 0, 3, 5, 9, 12), 2), -1)
        )

        testCases.forEach { testCase ->
            val (input, expected) = testCase
            val (nums, target) = input
            assertEquals(expected, search(nums, target))
        }
    }
}
