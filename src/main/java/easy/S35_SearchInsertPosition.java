package easy;

/**
 * 35. Search Insert Position
 * Easy
 * <p>
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * <p>
 * You may assume no duplicates in the array.
 * <p>
 * Example 1:
 * <p>
 * Input: [1,3,5,6], 5
 * Output: 2
 * Example 2:
 * <p>
 * Input: [1,3,5,6], 2
 * Output: 1
 * Example 3:
 * <p>
 * Input: [1,3,5,6], 7
 * Output: 4
 * Example 4:
 * <p>
 * Input: [1,3,5,6], 0
 * Output: 0
 *
 * @author mrc
 * Date: 2019/11/7 0007
 * Time: 16:18
 */
public class S35_SearchInsertPosition
{
    public int searchInsert(int[] nums, int target)
    {
        for (int i = 0; i < nums.length; i++)
        {
            if (target <= nums[i])
                return i;
        }
        return nums.length;
    }
}
