package easy;

/**
 * 136. Single Number
 * Easy
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 *
 * Note:
 *
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * Example 1:
 *
 * Input: [2,2,1]
 * Output: 1
 * Example 2:
 *
 * Input: [4,1,2,1,2]
 * Output: 4
 *
 * @author mrc
 * Date: 2020/4/3 0003
 * Time: 12:20
 */
public class Solution_136
{
    public static void main(String[] args)
    {
        System.out.println(new Solution_136().singleNumber(new int[]{2,2,1}));
        System.out.println(new Solution_136().singleNumber(new int[]{4,1,2,1,2}));
    }
    public int singleNumber(int[] nums) {
        int a = 0;
        for (int i = 0; i < nums.length; i++)
        {
            a ^= nums[i];
        }
        return a;
    }
}
