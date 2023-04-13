package net.wenzuo.codes.leetcode.no215;

import java.util.Random;

/**
 * 减治思想
 *
 * @author Catch
 * @since 2023-03-13
 */
class No215QuickSelect extends AbstractNo215 {

    private final Random random = new Random();

    @Override
    int findKthLargest(int[] nums, int k) {
        int target = nums.length - k;
        int l = 0, r = nums.length - 1;
        while (true) {
            int pivotIndex = partition(nums, l, r);
            if (target == pivotIndex) {
                return nums[target];
            } else if (pivotIndex > target) {
                r = pivotIndex - 1;
            } else {
                l = pivotIndex + 1;
            }
        }
    }

    private int partition(int[] nums, int l, int r) {
        int randomIndex = l + random.nextInt(r - l + 1);
        swap(nums, randomIndex, r);

        int pivot = nums[r];
        for (int i = l; i < r; i++) {
            if (nums[i] <= pivot) {
                swap(nums, l++, i);
            }
        }
        swap(nums, l, r);
        return l;
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

}
