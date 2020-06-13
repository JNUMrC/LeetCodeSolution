package easy;

/**
 * 167. Two Sum II - Input array is sorted
 * Easy
 * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
 * <p>
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
 * <p>
 * Note:
 * <p>
 * Your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution and you may not use the same element twice.
 * Example:
 * <p>
 * Input: numbers = [2,7,11,15], target = 9
 * Output: [1,2]
 * Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
 *
 * @author mrc
 * Date: 2020/4/7 0007
 * Time: 12:53
 */
public class S167_TwoSumII
{
    public int[] twoSum(int[] numbers, int target)
    {
        for (int i = 0, j = numbers.length - 1; i < j; )
        {
            while (i < j && numbers[i] + numbers[j] > target)
            {
                j--;
            }
            if (i < j)
            {
                if (numbers[i] + numbers[j] == target) return new int[]{i + 1, j + 1};
                else i++;
            }

        }
        return new int[]{};
    }
}
