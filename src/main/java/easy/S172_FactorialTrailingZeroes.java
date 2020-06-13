package easy;

/**
 * 172. Factorial Trailing Zeroes
 * Given an integer n, return the number of trailing zeroes in n!.
 *
 * Example 1:
 *
 * Input: 3
 * Output: 0
 * Explanation: 3! = 6, no trailing zero.
 * Example 2:
 *
 * Input: 5
 * Output: 1
 * Explanation: 5! = 120, one trailing zero.
 * Note: Your solution should be in logarithmic time complexity.
 *
 * @author mrc
 * Date: 2020/4/17 0017
 * Time: 12:48
 */
public class S172_FactorialTrailingZeroes
{
    public static void main(String[] args)
    {
        System.out.println(new S172_FactorialTrailingZeroes().trailingZeroes(5));
        System.out.println(new S172_FactorialTrailingZeroes().trailingZeroes(10));
        System.out.println(new S172_FactorialTrailingZeroes().trailingZeroes(15));
        System.out.println(new S172_FactorialTrailingZeroes().trailingZeroes(20));
        System.out.println(new S172_FactorialTrailingZeroes().trailingZeroes(25));
    }
    public int trailingZeroes(int n) {
        int r = 0;
        while (n >= 5)
        {
            r += n / 5;
            n /= 5;
        }
        return r;
    }
}
