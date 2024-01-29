/**
 * Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [-1,0,3,5,9,12], target = 9
 * Output: 4
 * Explanation: 9 exists in nums and its index is 4
 * Example 2:
 *
 * Input: nums = [-1,0,3,5,9,12], target = 2
 * Output: -1
 * Explanation: 2 does not exist in nums so return -1
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 10^4
 * -10^4 < nums[i], target < 10^4
 * All the integers in nums are unique.
 * nums is sorted in ascending order.
 * @see <a href="https://leetcode.com/problems/binary-search/">LeetCode</a>
 */
class Solution {
    fun search(nums: IntArray, target: Int): Int {
        return binarySearch(nums, target, 0, nums.size - 1)
    }

    fun binarySearch(nums: IntArray, target: Int, start: Int, end: Int): Int {
        if (start > end) {
            return -1
        }
        val mid: Int = start + ((end - start) / 2)
        return when {
            nums[mid] == target -> mid
            nums[mid] > target -> binarySearch(nums, target, start, mid - 1)
            else -> binarySearch(nums, target, mid + 1, end)
        }
    }
}
