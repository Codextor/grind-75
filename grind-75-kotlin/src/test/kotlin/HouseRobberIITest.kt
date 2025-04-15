import kotlin.test.Test
import kotlin.test.assertEquals

class HouseRobberIITest {

    @Test
    fun testRob() {
        val testCases = listOf(
            Pair(intArrayOf(2, 3, 2), 3),
            Pair(intArrayOf(1, 2, 3, 1), 4),
            Pair(intArrayOf(1, 2, 3), 3)
        )

        testCases.forEach { testCase ->
            val (input, expected) = testCase
            assertEquals(expected, rob(input))
        }
    }
}
