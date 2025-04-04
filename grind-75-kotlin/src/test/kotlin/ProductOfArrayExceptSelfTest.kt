import kotlin.test.Test
import kotlin.test.assertContentEquals

class ProductOfArrayExceptSelfTest {

    @Test
    fun testProductExceptSelf() {
        val testCases = listOf(
            Pair(intArrayOf(1, 2, 3, 4), intArrayOf(24, 12, 8, 6)),
            Pair(intArrayOf(-1, 1, 0, -3, 3), intArrayOf(0, 0, 9, 0, 0))
        )

        testCases.forEach { testCase ->
            val (nums, expected) = testCase
            assertContentEquals(expected, productExceptSelf(nums))
        }
    }
}
