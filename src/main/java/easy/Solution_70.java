package easy;

/**
 * 70. Climbing Stairs
 * Easy
 * <p>
 * You are climbing a stair case. It takes n steps to reach to the top.
 * <p>
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * <p>
 * Note: Given n will be a positive integer.
 * <p>
 * Example 1:
 * <p>
 * Input: 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * Example 2:
 * <p>
 * Input: 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 *
 * @author mrc
 * Date: 2019/11/8 0008
 * Time: 9:49
 */
public class Solution_70
{
    public int climbStairs(int n)
    {
        int a = 1;
        int b = 0;
        for (int i = 1; i < n; i++)
        {
            // 位运算中，& | 都会丢失信息，不可逆推，而 ^ 不会
            a = a ^ b;
            b = a ^ b;
            a = a ^ b;
            a = a + b;
        }
        return a + b;
    }
}
