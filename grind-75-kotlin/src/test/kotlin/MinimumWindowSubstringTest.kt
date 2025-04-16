import kotlin.test.Test
import kotlin.test.assertEquals

class MinimumWindowSubstringTest {

    @Test
    fun testMinWindow() {
        val testCases = listOf(
            Triple("ADOBECODEBANC", "ABC", "BANC"),
            Triple("a", "a", "a"),
            Triple("a", "aa", "")
        )

        testCases.forEach { testCase ->
            val (s, t, expected) = testCase
            assertEquals(expected, minWindow(s, t))
        }
    }
}
