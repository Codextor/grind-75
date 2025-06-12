/**
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 *
 *
 *
 * Example 1:
 *
 * Input: n = 3
 * Output: ["((()))","(()())","(())()","()(())","()()()"]
 *
 * Example 2:
 *
 * Input: n = 1
 * Output: ["()"]
 *
 *
 *
 * Constraints:
 *
 * 1 <= n <= 8
 *
 *
 * @see <a href="https://leetcode.com/problems/generate-parentheses/">LeetCode</a>
 */
fun generateParenthesis(n: Int): List<String> {
    val validCombinations = mutableListOf<String>()

    fun generateBalancedParentheses(current: CharArray, pos: Int, open: Int, close: Int) {
        if (pos == 2 * n) {
            validCombinations.add(String(current))
            return
        }

        if (open < n) {
            current[pos] = '('
            generateBalancedParentheses(current, pos + 1, open + 1, close)
        }

        if (close < open) {
            current[pos] = ')'
            generateBalancedParentheses(current, pos + 1, open, close + 1)
        }
    }

    generateBalancedParentheses(CharArray(2 * n), 0, 0, 0)
    return validCombinations
}
