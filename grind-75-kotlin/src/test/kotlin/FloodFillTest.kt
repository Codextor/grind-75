import org.junit.jupiter.api.Assertions.assertArrayEquals
import kotlin.test.Test

class FloodFillTest {

    @Test
    fun testFloodFill() {
        val testCases = listOf(
            Pair(
                Pair(arrayOf(intArrayOf(1, 1, 1), intArrayOf(1, 1, 0), intArrayOf(1, 0, 1)), Triple(1, 1, 2)),
                arrayOf(intArrayOf(2, 2, 2), intArrayOf(2, 2, 0), intArrayOf(2, 0, 1))
            ),
            Pair(
                Pair(arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 0, 0)), Triple(0, 0, 0)),
                arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 0, 0))
            )
        )

        testCases.forEach { testCase ->
            val (input, expected) = testCase
            val (image, integers) = input
            val (sr, sc, color) = integers
            assertArrayEquals(expected, floodFill(image, sr, sc, color))
        }
    }
}
