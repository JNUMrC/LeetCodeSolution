package easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 219. Contains Duplicate II
 * Easy
 * Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,1], k = 3
 * Output: true
 * Example 2:
 * <p>
 * Input: nums = [1,0,1,1], k = 1
 * Output: true
 * Example 3:
 * <p>
 * Input: nums = [1,2,3,1,2,3], k = 2
 * Output: false
 *
 * @author mrc
 * Date: 2020/5/15 0015
 * Time: 13:17
 */
public class S219_ContainsDuplicateII
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1, 2, 3, 1};
        System.out.println(new S219_ContainsDuplicateII().containsNearbyDuplicate(arr, 3));
        arr = new int[]{1, 0, 1, 1};
        System.out.println(new S219_ContainsDuplicateII().containsNearbyDuplicate(arr, 1));
        arr = new int[]{1, 2, 3, 1, 2, 3};
        System.out.println(new S219_ContainsDuplicateII().containsNearbyDuplicate(arr, 2));
    }

    public boolean containsNearbyDuplicate(int[] nums, int k)
    {
        // 缓存最近的k个数字
        // 当尝试加入下一个数字的时候发现已经存在，说明找到目标
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++)
        {
            // 删除已经出了范围的数字
            if(i > k) set.remove(nums[i - k - 1]);
            if(!set.add(nums[i])) return true;
        }
        return false;
    }

    public boolean containsNearbyDuplicate_1(int[] nums, int k)
    {
        // 缓存前面所有数字最靠后的下标，找到相同数字查看距离
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
        {
            Integer preIdx = map.get(nums[i]);
            if (preIdx != null)
            {
                if (i - preIdx <= k) return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
