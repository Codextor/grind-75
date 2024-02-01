/**
 * Given two strings ransomNote and magazine,
 * return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
 *
 * Each letter in magazine can only be used once in ransomNote.
 *
 *
 *
 * Example 1:
 *
 * Input: ransomNote = "a", magazine = "b"
 * Output: false
 * Example 2:
 *
 * Input: ransomNote = "aa", magazine = "ab"
 * Output: false
 * Example 3:
 *
 * Input: ransomNote = "aa", magazine = "aab"
 * Output: true
 *
 *
 * Constraints:
 *
 * 1 <= ransomNote.length, magazine.length <= 10^5
 * ransomNote and magazine consist of lowercase English letters.
 * @see <a href="https://leetcode.com/problems/ransom-note/">LeetCode</a>
 */
fun canConstruct(ransomNote: String, magazine: String): Boolean {
    val memoryMap = HashMap<Char, Int>()
    magazine.forEach { character ->
        memoryMap.put(character, 1 + memoryMap.getOrDefault(character, 0))
    }
    ransomNote.forEach { character ->
        if (memoryMap.getOrDefault(character, 0) == 0) {
            return false
        }
        memoryMap.put(character, memoryMap.getOrDefault(character, 1) - 1)
    }
    return true
}
