package net.wenzuo.codes.algorithm.sort;

/**
 * @author Catch
 * @since 2022-06-20
 */
public class InsertionSort implements Sort {

    @Override
    public void sort(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }
        // 从第二个元素开始,默认第一个元素是有序的
        for (int i = 1; i < nums.length; i++) {
            // 记录要插入的元素
            int value = nums[i];
            int j = i - 1;
            // 当比较的元素比要插入的元素大,则将比较的元素后移一位
            while (j >= 0 && nums[j] > value) {
                nums[j + 1] = nums[j];
                j--;
            }
            // 此时要比较的元素比插入的元素小,但 j 多减了一次
            // 所以要插入的位置为 j+1
            nums[j + 1] = value;
        }
    }

}