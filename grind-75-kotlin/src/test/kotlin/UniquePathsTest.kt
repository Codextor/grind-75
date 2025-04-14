import kotlin.test.Test
import kotlin.test.assertEquals

class UniquePathsTest {

    @Test
    fun testUniquePaths() {
        val testCases = listOf(
            Triple(3, 7, 28),
            Triple(3, 2, 3)
        )

        testCases.forEach { testCase ->
            val (m, n, expected) = testCase
            assertEquals(expected, uniquePaths(m, n))
        }
    }
}
