package net.wenzuo.codes.leetcode.no200;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 200. 岛屿数量
 * https://leetcode.cn/problems/number-of-islands/
 *
 * @author Catch
 * @since 2023-03-13
 */
class No200BFS extends AbstractNo200 {

    @Override
    int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        int[][] dirs = {
            {-1, 0}, {1, 0}, {0, -1}, {0, 1}
        };
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    grid[i][j] = 0;
                    queue.offer(new int[]{i, j});
                    while (!queue.isEmpty()) {
                        int[] cur = queue.poll();
                        for (int[] dir : dirs) {
                            int x = cur[0] + dir[0];
                            int y = cur[1] + dir[1];
                            if (x >= 0 && x < m && y >= 0 && y < n && grid[x][y] == '1') {
                                grid[x][y] = 0;
                                queue.offer(new int[]{x, y});
                            }
                        }
                    }
                }
            }
        }
        return count;
    }

}
