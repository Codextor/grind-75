import kotlin.test.Test
import kotlin.test.assertEquals

class BestTimeToBuyAndSellStockTest {

    @Test
    fun testMaxProfit() {
        val testCases = listOf(
            Pair(intArrayOf(7, 1, 5, 3, 6, 4), 5),
            Pair(intArrayOf(7, 6, 4, 3, 1), 0)
        )

        testCases.forEach { testCase ->
            val (input, expected) = testCase
            assertEquals(expected, maxProfit(input))
        }
    }
}
