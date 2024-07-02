import kotlin.test.Test
import kotlin.test.assertEquals

class ValidAnagramTest {

    @Test
    fun testIsAnagram() {
        val testCases = listOf(
            Pair(Pair("anagram", "nagaram"), true),
            Pair(Pair("rat", "car"), false)
        )

        testCases.forEach { testCase ->
            val (input, expected) = testCase
            val (s, t) = input
            assertEquals(expected, isAnagram(s, t))
        }
    }
}
