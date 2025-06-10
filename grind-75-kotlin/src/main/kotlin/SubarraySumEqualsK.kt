/**
 * Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
 *
 * A subarray is a contiguous non-empty sequence of elements within an array.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,1,1], k = 2
 * Output: 2
 *
 * Example 2:
 *
 * Input: nums = [1,2,3], k = 3
 * Output: 2
 *
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 2 * 10^4
 * -1000 <= nums[i] <= 1000
 * -10^7 <= k <= 10^7
 *
 *
 * @see <a href="https://leetcode.com/problems/subarray-sum-equals-k/">LeetCode</a>
 */
fun subarraySum(nums: IntArray, k: Int): Int {
    val prefixSumCountMap = mutableMapOf<Int, Int>()
    prefixSumCountMap[0] = 1

    var prefixSum = 0
    var count = 0

    for (num in nums) {
        prefixSum += num
        count += prefixSumCountMap[prefixSum - k] ?: 0
        prefixSumCountMap[prefixSum] = (prefixSumCountMap[prefixSum] ?: 0) + 1
    }

    return count
}
