import kotlin.test.Test
import kotlin.test.assertEquals

class DecodeWaysTest {

    @Test
    fun testNumDecodings() {
        val testCases = listOf(
            Pair("12", 2),
            Pair("226", 3),
            Pair("06", 0)
        )

        testCases.forEach { testCase ->
            val (input, expected) = testCase
            assertEquals(expected, numDecodings(input))
        }
    }
}
