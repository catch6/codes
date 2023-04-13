package net.wenzuo.codes.leetcode.no11;

/**
 * @author Catch
 * @since 2023-02-10
 */
class No11OfBruteForce extends AbstractNo11 {

    @Override
    int maxArea(int[] height) {
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
