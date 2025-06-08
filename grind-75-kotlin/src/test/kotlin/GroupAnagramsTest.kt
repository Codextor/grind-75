import kotlin.test.Test
import kotlin.test.assertEquals

class GroupAnagramsTest {

    @Test
    fun testGroupAnagrams() {
        val testCases =
            listOf(
                Pair(
                    arrayOf("eat", "tea", "tan", "ate", "nat", "bat"),
                    listOf(listOf("bat"), listOf("nat", "tan"), listOf("ate", "eat", "tea"))
                ),
                Pair(arrayOf(""), listOf(listOf(""))),
                Pair(arrayOf("a"), listOf(listOf("a")))
            )

        testCases.forEach { testCase ->
            val (input, expected) = testCase
            val actual = groupAnagrams(input)

            val sortedExpected = expected.map { it.sorted() }.sortedBy { it.first() }
            val sortedActual = actual.map { it.sorted() }.sortedBy { it.first() }

            assertEquals(sortedExpected, sortedActual)
        }
    }
}
