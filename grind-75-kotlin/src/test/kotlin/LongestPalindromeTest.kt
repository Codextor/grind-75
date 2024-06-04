import kotlin.test.Test
import kotlin.test.assertEquals

class LongestPalindromeTest {

    @Test
    fun testLongestPalindrome() {
        val testCases = listOf(
            Pair("abccccdd", 7),
            Pair("a", 1)
        )

        testCases.forEach { testCase ->
            val (input, expected) = testCase
            assertEquals(expected, longestPalindrome(input))
        }
    }
}
