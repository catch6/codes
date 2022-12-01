package sort;

/**
 * @author Catch
 * @since 2022-06-22
 */
public class SelectionSort implements Sort {

    @Override
    public void sort(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException();
        }
        if (nums.length <= 1) {
            return;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                // 每次找到剩余数组中的最小值的索引，并更新 minIndex
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            int tmp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = tmp;
        }
    }

}
