package net.wenzuo.codes.leetcode.no1;

import java.util.HashMap;
import java.util.Map;

/**
 * 采用 HashMap 将时间复杂度降低为 O(n)
 *
 * @author Catch
 * @since 2022-04-26
 */
public class No1OfHashMap extends AbstractNo1 {

    @Override
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        Integer another;
        for (int i = 0; i < nums.length; i++) {
            another = map.get(target - nums[i]);
            if (another != null) {
                return new int[]{i, another};
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }

}