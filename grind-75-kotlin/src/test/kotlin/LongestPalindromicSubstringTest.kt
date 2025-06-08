import kotlin.test.Test

class LongestPalindromicSubstringTest {

    @Test
    fun testLongestPalindromicSubstring() {
        val testCases = listOf(
            Pair("babad", setOf("bab", "aba")),
            Pair("cbbd", setOf("bb"))
        )

        testCases.forEach { testCase ->
            val (input, validAnswers) = testCase
            val result = longestPalindromicSubstring(input)
            assert(validAnswers.contains(result))
        }
    }
}
