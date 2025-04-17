import kotlin.test.Test
import kotlin.test.assertEquals

class PalindromicSubstringsTest {

    @Test
    fun testCountSubstrings() {
        val testCases = listOf(
            Pair("abc", 3),
            Pair("aaa", 6)
        )
        testCases.forEach { testCase ->
            val (input, expected) = testCase
            assertEquals(expected, countSubstrings(input))
        }
    }
}
