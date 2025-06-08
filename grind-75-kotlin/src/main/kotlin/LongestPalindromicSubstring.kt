/**
 * Given a string s, return the longest palindromic substring in s.
 *
 * A substring is a contiguous non-empty sequence of characters within a string.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "babad"
 * Output: "bab"
 * Explanation: "aba" is also a valid answer.
 *
 * Example 2:
 *
 * Input: s = "cbbd"
 * Output: "bb"
 *
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 1000
 * s consist of only digits and English letters.
 *
 * @see <a href="https://leetcode.com/problems/longest-palindrome/">LeetCode</a>
 */
fun longestPalindromicSubstring(s: String): String {
    if (s.length == 1) {
        return s
    }

    var longestStart = 0
    var longestLength = 1

    for (center in s.indices) {
        val currentMaxLength =
            maxOf(expandAroundCentre(s, center, center), expandAroundCentre(s, center, center + 1))

        if (currentMaxLength > longestLength) {
            longestLength = currentMaxLength
            longestStart = center - (currentMaxLength - 1) / 2
        }
    }

    return s.substring(longestStart, longestStart + longestLength)
}

private fun expandAroundCentre(s: String, leftStart: Int, rightStart: Int): Int {
    var left = leftStart
    var right = rightStart

    while (left >= 0 && right <= s.lastIndex && s[left] == s[right]) {
        left--
        right++
    }

    return right - left - 1
}
