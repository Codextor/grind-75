/**
 * Given a string s which consists of lowercase or uppercase letters,
 * return the length of the longest palindrome that can be built with those letters.
 *
 * Letters are case sensitive, for example, "Aa" is not considered a palindrome here.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abccccdd"
 * Output: 7
 * Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
 * Example 2:
 *
 * Input: s = "a"
 * Output: 1
 * Explanation: The longest palindrome that can be built is "a", whose length is 1.
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 2000
 * s consists of lowercase and/or uppercase English letters only.
 * @see <a href="https://leetcode.com/problems/longest-palindrome/">LeetCode</a>
 */
fun longestPalindrome(s: String): Int {
    val memoryMap = mutableMapOf<Char, Int>()
    s.forEach { character ->
        memoryMap.put(character, 1 + memoryMap.getOrDefault(character, 0))
    }
    var longestPalindromeLength = 0
    var middleElementEncountered = false
    memoryMap.values.forEach { frequency ->
        if (frequency.rem(2) == 0) {
            longestPalindromeLength += frequency
        } else {
            if (middleElementEncountered == false) {
                longestPalindromeLength += frequency
                middleElementEncountered = true
            } else {
                longestPalindromeLength += frequency - 1
            }
        }
    }
    return longestPalindromeLength
}
