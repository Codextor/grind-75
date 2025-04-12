import kotlin.test.Test
import kotlin.test.assertEquals

class WordBreakTest {

    @Test
    fun testWordBreak() {
        val testCases = listOf(
            Triple("leetcode", listOf("leet", "code"), true),
            Triple("applepenapple", listOf("apple", "pen"), true),
            Triple("catsandog", listOf("cats", "dog", "sand", "and", "cat"), false)
        )

        testCases.forEach { testCase ->
            val (s, wordDict, expected) = testCase
            assertEquals(expected, wordBreak(s, wordDict))
        }
    }
}
