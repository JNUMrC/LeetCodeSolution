package easy;

/**
 * 7. Reverse Integer
 * Easy
 * <p>
 * Given a 32-bit signed integer, reverse digits of an integer.
 * <p>
 * Example 1:
 * Input: 123
 * Output: 321
 * <p>
 * Example 2:
 * Input: -123
 * Output: -321
 * Example 3:
 * <p>
 * Input: 120
 * Output: 21
 * Note:
 * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1].
 * For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 *
 * @author mrc
 * Date: 2019/11/7 0007
 * Time: 14:15
 */
public class Solution_7
{
    public int reverse(int x)
    {
        long result = 0;

        while (x != 0)
        {
            result = result * 10 + x % 10;
            x /= 10;
        }

        return (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) ? 0 : (int) result;
    }
}
