package net.wenzuo.codes.leetcode.No1;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. 两数之和
 * https://leetcode.cn/problems/two-sum/
 *
 * @author Catch
 * @since 2022-04-26
 */
public class No1 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        Integer other;
        for (int i = 0; i < nums.length; i++) {
            other = map.get(target - nums[i]);
            if (other != null) {
                return new int[]{i, other};
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }

}