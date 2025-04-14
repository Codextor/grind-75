import kotlin.test.Test
import kotlin.test.assertEquals

class JumpGameTest {

    @Test
    fun testCanJump() {
        val testCases = listOf(
            Pair(intArrayOf(2, 3, 1, 1, 4), true),
            Pair(intArrayOf(3, 2, 1, 0, 4), false)
        )

        testCases.forEach { testCase ->
            val (nums, expected) = testCase
            assertEquals(expected, canJump(nums))
        }
    }
}
