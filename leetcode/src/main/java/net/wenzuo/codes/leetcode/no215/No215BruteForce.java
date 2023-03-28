package net.wenzuo.codes.leetcode.no215;

import java.util.Arrays;

/**
 * @author Catch
 * @since 2023-03-12
 */
public class No215BruteForce extends AbstractNo215 {

    @Override
    int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

}
