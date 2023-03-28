package net.wenzuo.codes.algorithm.sort;

/**
 * 快排算法实现
 * 基本思想是选择一个基准元素（pivot），将数组分成两个部分，
 * 左边比基准元素小，右边比基准元素大，然后递归地对这两部分进行排序。
 * 其中，选择基准元素的方法有多种，本例采用的是取中间值的方法。
 *
 * @author Catch
 * @since 2023-03-10
 */
public class QuickSort extends AbstractSort {

    @Override
    public void sort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        sort(arr, 0, arr.length - 1);
    }

    private void sort(int[] arr, int low, int high) {
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }
        if (low < j) {
            sort(arr, low, j);
        }
        if (high > i) {
            sort(arr, i, high);
        }
    }

}
