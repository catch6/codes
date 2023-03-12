package net.wenzuo.codes.leetcode.no11;

/**
 * @author Catch
 * @since 2023-02-10
 */
public class No11DoublePointer implements No11 {

    @Override
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int max = 0;
        while (r > l) {
            max = Math.max(max, (r - l) * Math.min(height[l], height[r]));
            if (height[l] > height[r]) {
                r--;
            } else {
                l++;
            }
        }
        return max;
    }

}
