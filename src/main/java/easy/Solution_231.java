package easy;

/**
 * <描述/>:
 *
 * @author mrc
 * Date: 2020/5/19 0019
 * Time: 12:04
 */
public class Solution_231
{
    public static void main(String[] args)
    {
        System.out.println(new Solution_231().isPowerOfTwo(1));
        System.out.println(new Solution_231().isPowerOfTwo(16));
        System.out.println(new Solution_231().isPowerOfTwo(218));
        System.out.println(new Solution_231().isPowerOfTwo(8));
        System.out.println(new Solution_231().isPowerOfTwo(32));
        System.out.println(new Solution_231().isPowerOfTwo(65537));

    }

    public boolean isPowerOfTwo(int n)
    {
        if (n <= 0) return false;
        return (n & (n - 1)) == 0;
    }
}
