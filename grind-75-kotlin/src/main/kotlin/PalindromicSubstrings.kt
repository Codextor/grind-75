/**
 * Given a string s, return the number of palindromic substrings in it.
 *
 * A string is a palindrome when it reads the same backward as forward.
 *
 * A substring is a contiguous sequence of characters within the string.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abc"
 * Output: 3
 * Explanation: Three palindromic strings: "a", "b", "c".
 * Example 2:
 *
 * Input: s = "aaa"
 * Output: 6
 * Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 1000
 * @see <a href="https://leetcode.com/problems/palindromic-substrings/">LeetCode</a>
 */
fun countSubstrings(s: String): Int {
    var substringCount = 0
    for (index in s.indices) {
        substringCount += countSubstringsWithCenter(s, index, index)
        substringCount += countSubstringsWithCenter(s, index, index + 1)
    }
    return substringCount
}

private fun countSubstringsWithCenter(s: String, start: Int, end: Int): Int {
    var count = 0
    var startIndex = start
    var endIndex = end
    while (startIndex >= 0 && endIndex < s.length && s[startIndex] == s[endIndex]) {
        count++
        startIndex--
        endIndex++
    }
    return count
}
