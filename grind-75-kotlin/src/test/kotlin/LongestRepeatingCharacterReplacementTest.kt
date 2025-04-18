import kotlin.test.Test
import kotlin.test.assertEquals

class LongestRepeatingCharacterReplacementTest {

    @Test
    fun testCharacterReplacement() {
        val testCases = listOf(
            Triple("ABAB", 2, 4),
            Triple("AABABBA", 1, 4)
        )

        testCases.forEach { testCase ->
            val (s, k, expected) = testCase
            assertEquals(expected, characterReplacement(s, k))
        }
    }
}
