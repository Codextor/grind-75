
import org.junit.jupiter.api.Assertions.assertArrayEquals
import kotlin.test.Test

class MergeIntervalsTest {

    @Test
    fun testMerge() {
        val testCases = listOf(
            Pair(
                arrayOf(intArrayOf(1, 3), intArrayOf(2, 6), intArrayOf(8, 10), intArrayOf(15, 18)),
                arrayOf(intArrayOf(1, 6), intArrayOf(8, 10), intArrayOf(15, 18))
            ),
            Pair(
                arrayOf(intArrayOf(1, 4), intArrayOf(4, 5)),
                arrayOf(intArrayOf(1, 5))
            )
        )

        testCases.forEach { testCase ->
            val (input, expected) = testCase
            assertArrayEquals(expected, merge(input))
        }
    }
}
