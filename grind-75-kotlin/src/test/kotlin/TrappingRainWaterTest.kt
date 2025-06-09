import kotlin.test.Test
import kotlin.test.assertEquals

class TrappingRainWaterTest {

    @Test
    fun testTrap() {
        val testCases = listOf(
            Pair(intArrayOf(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1), 6),
            Pair(intArrayOf(4, 2, 0, 3, 2, 5), 9)
        )

        testCases.forEach { testCase ->
            val (height, expected) = testCase
            assertEquals(expected, trap(height))
        }
    }
}
