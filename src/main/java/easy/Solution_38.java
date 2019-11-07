package easy;

/**
 * 38. Count and Say
 * <p>
 * The count-and-say sequence is the sequence of integers with the first five terms as following:
 * <p>
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 * <p>
 * Given an integer n where 1 ≤ n ≤ 30, generate the nth term of the count-and-say sequence.
 * <p>
 * Note: Each term of the sequence of integers will be represented as a string.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: 1
 * Output: "1"
 * Example 2:
 * <p>
 * Input: 4
 * Output: "1211"
 *
 * @author mrc
 * Date: 2019/11/7 0007
 * Time: 17:04
 */
public class Solution_38
{
    public String countAndSay(int n)
    {
        if (n < 1 || n > 30)
            return "";
        StringBuilder sb = new StringBuilder().append('1');
        for (int i = 1; i < n; i++)
        {
            StringBuilder temp = new StringBuilder();
            int idx = 1;
            char prev = sb.charAt(0);
            int count = 1;
            while (idx < sb.length())
            {
                if (sb.charAt(idx) != prev)
                {
                    temp.append(count).append(prev);
                    prev = sb.charAt(idx);
                    count = 1;
                }
                else
                {
                    count++;
                }
                idx++;
            }
            temp.append(count).append(prev);
            sb = temp;
        }
        return sb.toString();
    }
}
