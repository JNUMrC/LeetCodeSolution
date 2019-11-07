package easy;

/**
 * 69. Sqrt(x)
 * Easy
 * <p>
 * Implement int sqrt(int x).
 * <p>
 * Compute and return the square root of x, where x is guaranteed to be a non-negative integer.
 * <p>
 * Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.
 * <p>
 * Example 1:
 * <p>
 * Input: 4
 * Output: 2
 * Example 2:
 * <p>
 * Input: 8
 * Output: 2
 * Explanation: The square root of 8 is 2.82842..., and since
 * the decimal part is truncated, 2 is returned.
 *
 * @author mrc
 * Date: 2019/11/7 0007
 * Time: 20:47
 */
public class Solution_69
{
    /**
     * 牛顿法
     */
    public int mySqrt(int x)
    {
        if(x <= 0)
            return x;

        double last = 0.0;
        double res = 1.0;
        while (res != last)
        {
            last = res;
            res = (res + x / res) / 2;
        }
        return (int) res;
    }

    /**
     * 二分法
     */
    public int mySqrt1(int x)
    {
        if(x < 2)
            return x;

        int i = 0;
        int j = x / 2 + 1;
        while (i <= j)
        {
            int mid = (i + j) / 2;
            if (Integer.MAX_VALUE / mid < mid)
            {
                j = mid - 1;
            }
            else
            {
                int mid_ = mid * mid;
                if (mid_ == x)
                    return mid;
                else if (mid_ < x)
                    i = mid + 1;
                else
                    j = mid - 1;
            }
        }
        return j;
    }
}
