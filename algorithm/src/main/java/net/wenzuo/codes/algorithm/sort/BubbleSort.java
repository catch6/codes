package net.wenzuo.codes.algorithm.sort;

/**
 * @author Catch
 * @since 2022-06-20
 */
public class BubbleSort extends AbstractSort {

    @Override
    public void sort(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }
        // 是否发生交换，发生即说明当前还没有完全有序，需要继续排序
        boolean swapped = true;
        int len = nums.length;
        // 循环，直到不再发生交换
        while (swapped) {
            swapped = false;
            for (int i = 0; i < len - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    int value = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = value;
                    swapped = true;
                }
            }
            // 因为每轮循环，都把剩余的最大数移动到最后，
            // 所以最后面数已经是正确的位置不需要再比较
            len--;
        }
    }

}