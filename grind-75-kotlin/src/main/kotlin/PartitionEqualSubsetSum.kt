/**
 * Given an integer array nums,
 * return true if you can partition the array into two subsets such that the sum of the elements in both subsets is equal or false otherwise.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,5,11,5]
 * Output: true
 * Explanation: The array can be partitioned as [1, 5, 5] and [11].
 * Example 2:
 *
 * Input: nums = [1,2,3,5]
 * Output: false
 * Explanation: The array cannot be partitioned into equal sum subsets.
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 200
 * 1 <= nums[i] <= 100
 * @see <a href="https://leetcode.com/problems/palindromic-substrings/">LeetCode</a>
 */
fun canPartition(nums: IntArray): Boolean {
    val sum = nums.sum()

    if (sum % 2 != 0) {
        return false
    }

    val target = sum / 2

    val canAchieveSum = BooleanArray(target + 1) { false }
    canAchieveSum[0] = true

    for (currentNum in nums) {
        for (currentSum in target downTo currentNum) {
            canAchieveSum[currentSum] = canAchieveSum[currentSum] || canAchieveSum[currentSum - currentNum]
        }
    }

    return canAchieveSum[target]
}
