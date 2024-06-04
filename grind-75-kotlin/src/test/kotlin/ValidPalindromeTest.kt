import kotlin.test.Test
import kotlin.test.assertEquals

class ValidPalindromeTest {

    @Test
    fun testIsPalindrome() {
        val testCases = listOf(
            Pair("A man, a plan, a canal: Panama", true),
            Pair("race a car", false),
            Pair(" ", true)
        )

        testCases.forEach { testCase ->
            val (input, expected) = testCase
            assertEquals(expected, isPalindrome(input))
        }
    }
}
