package net.wenzuo.codes.leetcode.no4;

/**
 * 4. 寻找两个正序数组的中位数
 * https://leetcode.cn/problems/median-of-two-sorted-arrays/
 *
 * @author Catch
 * @since 2022-04-27
 */
public class No4 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int k1 = (nums1.length + nums2.length + 1) / 2;
        int k2 = (nums1.length + nums2.length + 2) / 2;
        return 0.5 * (getKth(nums1, 0, nums1.length - 1, nums2, 0, nums2.length - 1, k1) + getKth(nums1, 0, nums1.length - 1, nums2, 0, nums2.length - 1, k2));
    }

    private int getKth(int[] nums1, int start1, int end1, int[] nums2, int start2, int end2, int k) {
        // 当 nums1 比 nums2 短时交换位置，这样可以保证如果有数组空了，那一定是 nums1
        int len1 = end1 - start1 + 1;
        int len2 = end2 - start2 + 1;
        if (len1 > len2) {
            return getKth(nums2, start2, end2, nums1, start1, end1, k);
        }
        // 如果 nums1 空了，就取 nums2 的第 k 个元素，要算上偏移值 start2
        if (len1 == 0) {
            // 取第k个元素,需要减去1,得到下标
            return nums2[start2 + k - 1];
        }
        // 如果 nums1 和 nums2 都不空，k 最终都会成为 1，即取第 1 小的值，也就是两个数中的最小值
        if (k == 1) {
            return Math.min(nums1[start1], nums2[start2]);
        }
        // k>1，那就继续往下分割，直到 k=1
        int l1 = start1 + Math.min(k / 2, len1) - 1;
        int l2 = start2 + Math.min(k / 2, len2) - 1;
        if (nums1[l1] <= nums2[l2]) {
            // 此处需要注意 k 值减去的值为上次偏移之后又减少的个数
            return getKth(nums1, l1 + 1, end1, nums2, start2, end2, k - (l1 - start1 + 1));
        }
        // 此处需要注意 k 值减去的值为上次偏移之后又减少的个数
        return getKth(nums1, start1, end1, nums2, l2 + 1, end2, k - (l2 - start2 + 1));
    }

}