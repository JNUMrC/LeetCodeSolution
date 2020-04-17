package easy;

import java.util.Arrays;

/**
 * 169. Majority Element
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 *
 * You may assume that the array is non-empty and the majority element always exist in the array.
 *
 * Example 1:
 *
 * Input: [3,2,3]
 * Output: 3
 * Example 2:
 *
 * Input: [2,2,1,1,1,2,2]
 * Output: 2
 *
 * @author mrc
 * Date: 2020/4/17 0017
 * Time: 12:25
 */
public class Solution_169
{
    public static void main(String[] args)
    {
        System.out.println(new Solution_169().majorityElement(new int[]{3,2,3}));
        System.out.println(new Solution_169().majorityElement(new int[]{2,2,1,1,1,2,2}));
    }
    public int majorityElement(int[] nums) {
//        if(nums == null || nums.length == 0) return 0;
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++)
//        {
//            map.merge(nums[i], 1, Integer::sum);
//        }
//        int half = nums.length / 2;
//        for (Map.Entry<Integer, Integer> entry : map.entrySet())
//        {
//            if(entry.getValue() > half) return entry.getKey();
//        }
//        return 0;

        if(nums == null || nums.length == 0) return 0;
        if(nums.length <= 2) return nums[0];
        Arrays.sort(nums);
        int half = nums.length / 2;
        return nums[half] == nums[half + 1] ? nums[half] : nums[half - 1];
    }
}
