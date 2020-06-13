package easy;

/**
 * 9. Palindrome Number
 * Easy
 * <p>
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 * <p>
 * Example 1:
 * Input: 121
 * Output: true
 * Example 2:
 * <p>
 * Input: -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 * <p>
 * Input: 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 * Follow up:
 * <p>
 * Coud you solve it without converting the integer to a string?
 *
 * @author mrc
 * Date: 2019/11/7 0007
 * Time: 14:17
 */
public class S9_PalindromeNumber
{
    public boolean isPalindrome(int x)
    {
        if (x < 0)
            return false;
        int old = x;
        long t = 0;
        while (x != 0)
        {
            t = t * 10 + x % 10;
            x /= 10;
        }
        return t == old;
    }
}
