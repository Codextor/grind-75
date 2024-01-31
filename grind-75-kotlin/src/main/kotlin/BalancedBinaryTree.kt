import commonclasses.TreeNode
import kotlin.math.abs

/**
 * Given a binary tree, determine if it is
 * height-balanced
 * .
 *
 *
 *
 * Example 1:
 *
 *
 * Input: root = [3,9,20,null,null,15,7]
 * Output: true
 * Example 2:
 *
 *
 * Input: root = [1,2,2,3,3,null,null,4,4]
 * Output: false
 * Example 3:
 *
 * Input: root = []
 * Output: true
 *
 *
 * Constraints:
 *
 * The number of nodes in the tree is in the range [0, 5000].
 * -104 <= Node.val <= 104
 * @see <a href="https://leetcode.com/problems/balanced-binary-tree/">LeetCode</a>
 *
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
fun isBalanced(root: TreeNode?): Boolean {
    return heightOfNode(root) != -1
}

private fun heightOfNode(node: TreeNode?): Int {
    if (node == null) {
        return 0
    }
    val heightOfLeftSubtree = heightOfNode(node.left)
    val heightOfRightSubtree = heightOfNode(node.right)
    return if (heightOfLeftSubtree == -1 || heightOfRightSubtree == -1 || abs(heightOfLeftSubtree - heightOfRightSubtree) > 1) {
        -1
    } else {
        1 + maxOf(heightOfLeftSubtree, heightOfRightSubtree)
    }
}
