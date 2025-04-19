import kotlin.test.Test
import kotlin.test.assertEquals

class ContainerWithMostWaterTest {

    @Test
    fun testMaxArea() {
        val testCases = listOf(
            Pair(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7), 49),
            Pair(intArrayOf(1, 1), 1)
        )

        testCases.forEach { testCase ->
            val (height, expected) = testCase
            assertEquals(expected, maxArea(height))
        }
    }
}
