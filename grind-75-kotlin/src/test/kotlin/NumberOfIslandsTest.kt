import kotlin.test.Test
import kotlin.test.assertEquals

class NumberOfIslandsTest {

    @Test
    fun testNumIslands() {
        val testCases = listOf(
            Pair(
                arrayOf(
                    charArrayOf('1', '1', '1', '1', '0'),
                    charArrayOf('1', '1', '0', '1', '0'),
                    charArrayOf('1', '1', '0', '0', '0'),
                    charArrayOf('0', '0', '0', '0', '0')
                ),
                1
            ),
            Pair(
                arrayOf(
                    charArrayOf('1', '1', '0', '0', '0'),
                    charArrayOf('1', '1', '0', '0', '0'),
                    charArrayOf('0', '0', '1', '0', '0'),
                    charArrayOf('0', '0', '0', '1', '1')
                ),
                3
            )
        )

        testCases.forEach { testCase ->
            val (grid, expected) = testCase
            assertEquals(expected, numIslands(grid))
        }
    }
}
