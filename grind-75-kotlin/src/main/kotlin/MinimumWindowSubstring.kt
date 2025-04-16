/**
 * Given two strings s and t of lengths m and n respectively, return the minimum window
 * substring
 * of s such that every character in t (including duplicates) is included in the window.
 * If there is no such substring, return the empty string "".
 *
 * The testcases will be generated such that the answer is unique.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "ADOBECODEBANC", t = "ABC"
 * Output: "BANC"
 * Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
 * Example 2:
 *
 * Input: s = "a", t = "a"
 * Output: "a"
 * Explanation: The entire string s is the minimum window.
 * Example 3:
 *
 * Input: s = "a", t = "aa"
 * Output: ""
 * Explanation: Both 'a's from t must be included in the window.
 * Since the largest window of s only has one 'a', return empty string.
 *
 *
 * Constraints:
 *
 * m == s.length
 * n == t.length
 * 1 <= m, n <= 10^5
 * s and t consist of uppercase and lowercase English letters.
 *
 *
 * Follow up: Could you find an algorithm that runs in O(m + n) time?
 * @see <a href="https://leetcode.com/problems/minimum-window-substring/">LeetCode</a>
 */
fun minWindow(s: String, t: String): String {
    if (s.length < t.length) {
        return ""
    }

    val requiredCount = IntArray(128)
    for (char in t) {
        requiredCount[char.code]++
    }

    var left = 0
    var right = 0
    var requiredChars = t.length
    var minWindowLength = Int.MAX_VALUE
    var minLeft = 0

    while (right < s.length) {
        val rightChar = s[right].code
        if (requiredCount[rightChar] > 0) {
            requiredChars--
        }
        requiredCount[rightChar]--
        right++

        while (requiredChars == 0) {
            if (right - left < minWindowLength) {
                minWindowLength = right - left
                minLeft = left
            }

            val leftChar = s[left].code
            requiredCount[leftChar]++
            if (requiredCount[leftChar] > 0) {
                requiredChars++
            }
            left++
        }
    }

    return if (minWindowLength != Int.MAX_VALUE) {
        s.substring(minLeft, minLeft + minWindowLength)
    } else {
        ""
    }
}
