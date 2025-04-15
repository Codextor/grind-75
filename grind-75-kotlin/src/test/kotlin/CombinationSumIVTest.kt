import kotlin.test.Test
import kotlin.test.assertEquals

class CombinationSumIVTest {

    @Test
    fun testCombinationSum4() {
        val testCases = listOf(
            Triple(intArrayOf(1, 2, 3), 4, 7),
            Triple(intArrayOf(9), 3, 0)
        )

        testCases.forEach { testCase ->
            val (nums, target, expected) = testCase
            assertEquals(expected, combinationSum4(nums, target))
        }
    }
}
