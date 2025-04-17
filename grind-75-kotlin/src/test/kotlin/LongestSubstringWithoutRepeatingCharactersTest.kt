import kotlin.test.Test
import kotlin.test.assertEquals

class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    fun testLengthOfLongestSubstring() {
        val testCases = listOf(
            Pair("abcabcbb", 3),
            Pair("bbbbb", 1),
            Pair("pwwkew", 3)
        )

        testCases.forEach { testCase ->
            val (input, expected) = testCase
            assertEquals(expected, lengthOfLongestSubstring(input))
        }
    }
}
