import kotlin.test.Test
import kotlin.test.assertEquals

class ContainsDuplicateTest {

    @Test
    fun testContainsDuplicate() {
        val testCases = listOf(
            Pair(intArrayOf(1, 2, 3, 1), true),
            Pair(intArrayOf(1, 2, 3, 4), false),
            Pair(intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2), true)
        )

        testCases.forEach { (input, expected) ->
            assertEquals(expected, containsDuplicate(input))
        }
    }
}
