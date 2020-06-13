package easy;

/**
 * 231. Power of Two
 * Easy
 * Given an integer, write a function to determine if it is a power of two.
 *
 * Example 1:
 *
 * Input: 1
 * Output: true
 * Explanation: 20 = 1
 * Example 2:
 *
 * Input: 16
 * Output: true
 * Explanation: 24 = 16
 * Example 3:
 *
 * Input: 218
 * Output: false
 *
 * @author mrc
 * Date: 2020/5/19 0019
 * Time: 12:04
 */
public class S231_PowerOfTwo
{
    public static void main(String[] args)
    {
        System.out.println(new S231_PowerOfTwo().isPowerOfTwo(1));
        System.out.println(new S231_PowerOfTwo().isPowerOfTwo(16));
        System.out.println(new S231_PowerOfTwo().isPowerOfTwo(218));
        System.out.println(new S231_PowerOfTwo().isPowerOfTwo(8));
        System.out.println(new S231_PowerOfTwo().isPowerOfTwo(32));
        System.out.println(new S231_PowerOfTwo().isPowerOfTwo(65537));

    }

    public boolean isPowerOfTwo(int n)
    {
        if (n <= 0) return false;
        return (n & (n - 1)) == 0;
    }
}
