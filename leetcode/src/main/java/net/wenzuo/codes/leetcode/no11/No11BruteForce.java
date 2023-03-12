package net.wenzuo.codes.leetcode.no11;

/**
 * @author Catch
 * @since 2023-02-10
 */
public class No11BruteForce implements No11 {

    @Override
    public int maxArea(int[] height) {
        int max = 0;
        int cur;
        for (int i = 0; i < height.length; i++) {
            for (int j = i; j < height.length; j++) {
                cur = (j - i) * Math.min(height[i], height[j]);
                if (cur > max) {
                    max = cur;
                }
            }
        }
        return max;
    }

}
