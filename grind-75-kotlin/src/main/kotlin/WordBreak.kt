/**
 * Given a string s and a dictionary of strings wordDict,
 * return true if s can be segmented into a space-separated sequence of one or more dictionary words.
 *
 * Note that the same word in the dictionary may be reused multiple times in the segmentation.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "leetcode", wordDict = ["leet","code"]
 * Output: true
 * Explanation: Return true because "leetcode" can be segmented as "leet code".
 * Example 2:
 *
 * Input: s = "applepenapple", wordDict = ["apple","pen"]
 * Output: true
 * Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
 * Note that you are allowed to reuse a dictionary word.
 * Example 3:
 *
 * Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
 * Output: false
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 300
 * 1 <= wordDict.length <= 1000
 * 1 <= wordDict[i].length <= 20
 * s and wordDict[i] consist of only lowercase English letters.
 * All the strings of wordDict are unique.
 * @see <a href="https://leetcode.com/problems/word-break/">LeetCode</a>
 */
fun wordBreak(s: String, wordDict: List<String>): Boolean {
    val setOfWords = wordDict.toSet()

    val maxWordLength = 20

    val canSegmentUpToIndex = BooleanArray(s.length + 1) { false }
    canSegmentUpToIndex[0] = true

    for (endIndex in 1..s.length) {
        val minPossibleStartIndex = maxOf(0, endIndex - maxWordLength)

        for (startIndex in (endIndex - 1) downTo minPossibleStartIndex) {
            if (canSegmentUpToIndex[startIndex] && s.substring(startIndex, endIndex) in setOfWords) {
                canSegmentUpToIndex[endIndex] = true
                break
            }
        }
    }

    return canSegmentUpToIndex[s.length]
}
