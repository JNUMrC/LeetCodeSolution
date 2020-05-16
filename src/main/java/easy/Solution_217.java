package easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 217. Contains Duplicate
 * Easy
 * Given an array of integers, find if the array contains any duplicates.
 * <p>
 * Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 * <p>
 * Example 1:
 * <p>
 * Input: [1,2,3,1]
 * Output: true
 * Example 2:
 * <p>
 * Input: [1,2,3,4]
 * Output: false
 * Example 3:
 * <p>
 * Input: [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 *
 * @author mrc
 * Date: 2020/5/15 0015
 * Time: 13:01
 */
public class Solution_217
{
    public boolean containsDuplicate(int[] nums)
    {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++)
        {
            if(nums[i - 1] == nums[i]) return true;
        }
        return false;
    }

    public boolean containsDuplicate_2(int[] nums)
    {
        for (int i = 0; i < nums.length - 1; i++)
        {
            for (int j = i + 1; j < nums.length; j++)
            {
                if(nums[i] == nums[j]) return true;
            }
        }
        return false;
    }

    public boolean containsDuplicate_1(int[] nums)
    {
        Set<Integer> set = new HashSet<>();
        for (int num : nums)
        {
            if(set.contains(num)) return true;
            set.add(num);
        }
        return false;
    }
}
