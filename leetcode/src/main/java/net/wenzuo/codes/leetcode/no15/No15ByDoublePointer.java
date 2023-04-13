package net.wenzuo.codes.leetcode.no15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 15. 三数之和
 * https://leetcode.cn/problems/3sum/
 *
 * 解题思路:
 * 1. 首先将数组排序，这样方便后续操作。
 * 2. 固定一个数 nums[i]，然后在 i+1 和数组末尾之间设置双指针 left 和 right，计算三数之和 sum = nums[i] + nums[left] + nums[right]。
 * 3. 如果 sum > 0，说明 right 的数太大，需要将 right 向左移动，反之，如果 sum < 0，说明 left 的数太小，需要将 left 向右移动，直到找到一个满足 sum = 0 的三元组。
 * 4. 需要注意的是，如果 nums[i] > 0 或者 nums[right] < 0，那么肯定不存在满足条件 sum = 0 的三元组，可以直接退出循环。
 *
 * @author Catch
 * @since 2023-03-12
 */
class No15ByDoublePointer extends AbstractNo15 {

    @Override
    List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length;
        if (nums[len - 1] < 0) {
            return res;
        }
        for (int i = 0; i < len - 2; i++) {
            if (nums[i] > 0) {
                return res;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int l = i + 1, r = len - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }
                    while (l < r && nums[r] == nums[r + 1]) {
                        r--;
                    }
                } else if (sum > 0) {
                    r--;
                } else {
                    l++;
                }
            }
        }
        return res;
    }

}
