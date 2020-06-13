package easy;

/**
 * 202. Happy Number
 * Easy
 * Write an algorithm to determine if a number n is "happy".
 *
 * A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
 *
 * Return True if n is a happy number, and False if not.
 *
 * Example:
 *
 * Input: 19
 * Output: true
 * Explanation:
 * 1^2 + 9^2 = 82
 * 8^2 + 2^2 = 68
 * 6^2 + 8^2 = 100
 * 1^2 + 0^2 + 0^2 = 1
 *
 * @author mrc
 * Date: 2020/4/20 0020
 * Time: 12:25
 */
public class S202_HappyNumber
{
    public static void main(String[] args)
    {
        System.out.println(new S202_HappyNumber().isHappy(19));
    }
    // 原理是用两个速度不一样的变量，如果有环，则总会遇上，空间利用率比较高
    public boolean isHappy(int n) {
        int x = n;
        int y = n;
        while (x > 1)
        {
            x = getNext(x);
            if(x == 1) return true;
            y = getNext(getNext(y));
            if(y == 1) return true;
            if(x == y) return false;
        }
        return true;
    }

    public int getNext(int n)
    {
        int next = 0;
        while (n > 0)
        {
            int t = n % 10;
            next += t * t;
            n /= 10;
        }
        return next;
    }
}
