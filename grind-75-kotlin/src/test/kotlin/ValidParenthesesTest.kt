import kotlin.test.Test
import kotlin.test.assertEquals

class ValidParenthesesTest {

    @Test
    fun testIsValid() {
        val testCases = listOf(
            Pair("()", true),
            Pair("()[]{}", true),
            Pair("(]", false)
        )

        testCases.forEach { testCase ->
            val (input, expected) = testCase
            assertEquals(expected, isValid(input))
        }
    }
}
