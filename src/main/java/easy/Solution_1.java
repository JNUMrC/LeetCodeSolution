package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. Two Sum
 * Easy
 * <p>
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 *
 * @author mrc
 * Date: 2019/11/7 0007
 * Time: 14:13
 */
public class Solution_1
{
    public int[] twoSum(int[] nums, int target)
    {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
        {
            if (map.containsKey(target - nums[i]))
            {
                return new int[]{i, map.get(target - nums[i])};
            }
            else
            {
                map.put(nums[i], i);
            }
        }

        return null;
    }
}
