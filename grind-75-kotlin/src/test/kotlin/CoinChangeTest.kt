import kotlin.test.Test
import kotlin.test.assertEquals

class CoinChangeTest {

    @Test
    fun testCoinChange() {
        val testCases = listOf(
            Triple(intArrayOf(1, 2, 5), 11, 3),
            Triple(intArrayOf(2), 3, -1),
            Triple(intArrayOf(1), 0, 0)
        )

        testCases.forEach { testCase ->
            val (coins, amount, expected) = testCase
            assertEquals(expected, coinChange(coins, amount))
        }
    }
}
