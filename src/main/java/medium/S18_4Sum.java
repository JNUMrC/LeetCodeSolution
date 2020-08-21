package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 18. 4Sum
 * Medium
 *
 * Given an array nums of n integers and an integer target, are there elements a, b, c, and d in nums such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.
 *
 * Note:
 *
 * The solution set must not contain duplicate quadruplets.
 *
 * Example:
 *
 * Given array nums = [1, 0, -1, 0, -2, 2], and target = 0.
 *
 * A solution set is:
 * [
 *   [-1,  0, 0, 1],
 *   [-2, -1, 1, 2],
 *   [-2,  0, 0, 2]
 * ]
 *
 * @author mrc
 * Date: 2020/8/21 0021
 * Time: 12:45
 */
public class S18_4Sum {
    public static void main(String[] args) {

    }

    /**
     * 前两个下标，判断是否重复执行
     * 后两个下标从两头往中间靠，也判断重复元素
     */
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; ++i) {
            if ((i != 0) && (nums[i] == nums[i - 1])) continue;
            for (int j = i + 1; j < nums.length - 2; ++j) {
                if ((j != i + 1) && (nums[j] == nums[j - 1])) continue;
                int lo = j + 1, hi = nums.length - 1, x = target - nums[i] - nums[j];
                while (lo < hi) {
                    if (nums[lo] + nums[hi] == x) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[lo], nums[hi]));
                        while (lo < hi && nums[lo] == nums[lo + 1]) ++lo;
                        while (lo < hi && nums[hi] == nums[hi - 1]) --hi;
                        ++lo;
                        --hi;
                    } else if(nums[lo] + nums[hi] > x) --hi;
                    else ++lo;
                }
            }
        }
        return result;
    }
}
