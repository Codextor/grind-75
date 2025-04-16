import kotlin.test.Test
import kotlin.test.assertEquals

class ClimbingStairsTest {

    @Test
    fun testClimbStairs() {
        val testCases = listOf(
            Pair(2, 2),
            Pair(3, 3)
        )

        testCases.forEach { testCase ->
            val (n, expected) = testCase
            assertEquals(expected, climbStairs(n))
        }
    }
}
