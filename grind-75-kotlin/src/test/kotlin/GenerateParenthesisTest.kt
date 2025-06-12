import kotlin.test.Test
import kotlin.test.assertEquals

class GenerateParenthesisTest {

    @Test
    fun testGenerateParenthesis() {
        val testCases = listOf(
            Pair(3, listOf("((()))", "(()())", "(())()", "()(())", "()()()")),
            Pair(1, listOf("()"))
        )

        testCases.forEach { testCase ->
            val (n, expected) = testCase
            val result = generateParenthesis(n)
            assertEquals(expected.size, result.size)
            assertEquals(expected.toSet(), result.toSet())
        }
    }
}
