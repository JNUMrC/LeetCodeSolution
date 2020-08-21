package medium;

import java.util.Arrays;

/**
 * 3Sum Closest
 * Medium
 *
 * Given an array nums of n integers and an integer target, find three integers in nums such that the sum is closest to target. Return the sum of the three integers. You may assume that each input would have exactly one solution.
 *
 * Example 1:
 *
 * Input: nums = [-1,2,1,-4], target = 1
 * Output: 2
 * Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 *
 * Constraints:
 *
 * 3 <= nums.length <= 10^3
 * -10^3 <= nums[i] <= 10^3
 * -10^4 <= target <= 10^4
 *
 * @author mrc
 * Date: 2020/8/20 0020
 * Time: 12:31
 */
public class S16_3SumClosest {
    public static void main(String[] args) {
        int[] arr = {1,2,4,8,16,32,64,128};
        System.out.println(new S16_3SumClosest().threeSumClosest(arr, 82));
    }

    public int threeSumClosest(int[] nums, int target) {
        int result = nums[0] + nums[1] + nums[nums.length - 1];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int lo = i + 1, hi = nums.length - 1;
            while (lo < hi) {
                int sum = nums[i] + nums[lo] + nums[hi];
                if (sum > target) --hi;
                else ++lo;
                if (Math.abs(sum - target) < Math.abs(result - target))
                    result = sum;
            }
        }
        return result;
    }
}
