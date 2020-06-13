package easy;

/**
 * 66. Plus One
 * Easy
 * <p>
 * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
 * <p>
 * The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
 * <p>
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 * <p>
 * Example 1:
 * <p>
 * Input: [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Example 2:
 * <p>
 * Input: [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 *
 * @author mrc
 * Date: 2019/11/7 0007
 * Time: 20:03
 */
public class S66_PlusOne
{
    public int[] plusOne(int[] digits)
    {
        if (digits == null || digits.length == 0)
            return digits;

        for (int i = digits.length - 1; i >= 0; i--)
        {
            int n = digits[i] + 1;
            digits[i] = n % 10;
            if (n < 10)
                return digits;
        }
        int[] arr = new int[digits.length + 1];
        arr[0] = 1;
        for (int i = 0; i < digits.length; i++)
        {
            arr[i + 1] = digits[i];
        }
        return arr;
    }
}
