/**
 * Given n non-negative integers representing an elevation map where the width of each bar is 1,
 * compute how much water it can trap after raining.
 *
 *
 *
 * Example 1:
 *
 * Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
 * Output: 6
 * Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1].
 * In this case, 6 units of rain water (blue section) are being trapped.
 *
 * Example 2:
 *
 * Input: height = [4,2,0,3,2,5]
 * Output: 9
 *
 *
 *
 * Constraints:
 *
 * n == height.length
 * 1 <= n <= 2 * 10^4
 * 0 <= height[i] <= 10^5
 *
 *
 * @see <a href="https://leetcode.com/problems/trapping-rain-water/">LeetCode</a>
 */
fun trap(height: IntArray): Int {
    if (height.size <= 2) return 0

    var left = 0
    var right = height.lastIndex
    var leftMax = height[0]
    var rightMax = height[height.lastIndex]
    var trappedWater = 0

    while (left < right) {
        if (leftMax <= rightMax) {
            left++
            if (height[left] > leftMax) {
                leftMax = height[left]
            } else {
                trappedWater += leftMax - height[left]
            }
        } else {
            right--
            if (height[right] > rightMax) {
                rightMax = height[right]
            } else {
                trappedWater += rightMax - height[right]
            }
        }
    }

    return trappedWater
}
