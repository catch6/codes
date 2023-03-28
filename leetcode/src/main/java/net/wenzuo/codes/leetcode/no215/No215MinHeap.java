package net.wenzuo.codes.leetcode.no215;

import java.util.PriorityQueue;

/**
 * 215. 数组中的第K个最大元素
 * https://leetcode.cn/problems/kth-largest-element-in-an-array/
 *
 * @author Catch
 * @since 2023-03-12
 */
public class No215MinHeap extends AbstractNo215 {

    @Override
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i : nums) {
            if (minHeap.size() < k) {
                minHeap.offer(i);
            } else if (i > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(i);
            }
        }
        return minHeap.peek();
    }

}
