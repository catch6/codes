package net.wenzuo.codes.leetcode.no4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Catch
 * @since 2022-04-28
 */
class No4Test {

    private final No4 no4 = new No4();

    @Test
    void findMedianSortedArrays1() {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double result = no4.findMedianSortedArrays(nums1, nums2);
        Assertions.assertEquals(2.0, result);
    }

    @Test
    void findMedianSortedArrays2() {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        double result = no4.findMedianSortedArrays(nums1, nums2);
        Assertions.assertEquals(2.5, result);
    }

}