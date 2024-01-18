/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 *
 *
 * Example 1:
 *
 * Input: s = "()"
 * Output: true
 * Example 2:
 *
 * Input: s = "()[]{}"
 * Output: true
 * Example 3:
 *
 * Input: s = "(]"
 * Output: false
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 10^4
 * s consists of parentheses only '()[]{}'.
 * @see <a href="https://leetcode.com/problems/valid-parentheses/">LeetCode</a>
 */
fun isValid(s: String): Boolean {
    if (s.length % 2 == 1) return false

    val deque = ArrayDeque<Char>()
    for (parenthesis in s) {
        when (parenthesis) {
            in openingParenthesesSet -> parenthesesMap[parenthesis]?.let { deque.addLast(it) }
            in closingParenthesesSet -> if (deque.lastOrNull() == parenthesis) deque.removeLast() else return false
        }
    }
    return deque.isEmpty()
}

val parenthesesMap = mapOf('(' to ')', '{' to '}', '[' to ']')
val openingParenthesesSet = setOf('(', '{', '[')
val closingParenthesesSet = setOf(')', '}', ']')
