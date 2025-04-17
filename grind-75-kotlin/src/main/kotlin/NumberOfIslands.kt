/**
 * Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water),
 * return the number of islands.
 *
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
 * You may assume all four edges of the grid are all surrounded by water.
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [
 *   ["1","1","1","1","0"],
 *   ["1","1","0","1","0"],
 *   ["1","1","0","0","0"],
 *   ["0","0","0","0","0"]
 * ]
 * Output: 1
 * Example 2:
 *
 * Input: grid = [
 *   ["1","1","0","0","0"],
 *   ["1","1","0","0","0"],
 *   ["0","0","1","0","0"],
 *   ["0","0","0","1","1"]
 * ]
 * Output: 3
 *
 *
 * Constraints:
 *
 * m == grid.length
 * n == grid[i].length
 * 1 <= m, n <= 300
 * grid[i][j] is '0' or '1'.
 * @see <a href="https://leetcode.com/problems/number-of-islands/">LeetCode</a>
 */
fun numIslands(grid: Array<CharArray>): Int {
    var numberOfIslands = 0

    for (row in grid.indices) {
        for (col in grid[0].indices) {
            if (grid[row][col] == '1') {
                numberOfIslands++
                markIsland(grid, row, col)
            }
        }
    }

    return numberOfIslands
}

private fun markIsland(grid: Array<CharArray>, row: Int, col: Int) {
    if (isValidLand(grid, row, col)) {
        grid[row][col] = '0'

        markIsland(grid, row + 1, col)
        markIsland(grid, row - 1, col)
        markIsland(grid, row, col + 1)
        markIsland(grid, row, col - 1)
    }
}

private fun isValidLand(grid: Array<CharArray>, row: Int, col: Int): Boolean {
    return row in grid.indices && col in grid[0].indices && grid[row][col] == '1'
}
