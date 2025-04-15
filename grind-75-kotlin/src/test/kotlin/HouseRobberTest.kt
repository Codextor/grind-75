import kotlin.test.Test
import kotlin.test.assertEquals

class HouseRobberTest {

    @Test
    fun testRob() {
        val testCases = listOf(
            Pair(intArrayOf(1, 2, 3, 1), 4),
            Pair(intArrayOf(2, 7, 9, 3, 1), 12)
        )

        testCases.forEach { testCase ->
            val (input, expected) = testCase
            assertEquals(expected, rob(input))
        }
    }
}
