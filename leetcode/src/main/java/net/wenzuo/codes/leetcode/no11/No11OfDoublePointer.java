package net.wenzuo.codes.leetcode.no11;

/**
 * @author Catch
 * @since 2023-02-10
 */
class No11OfDoublePointer extends AbstractNo11 {

    @Override
    int maxArea(int[] height) {
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
