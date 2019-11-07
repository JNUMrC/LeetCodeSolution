package easy;

/**
 * 13. Roman to Integer
 * Easy
 * <p>
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * <p>
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.
 * <p>
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 * <p>
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.
 *
 * @author mrc
 * Date: 2019/11/7 0007
 * Time: 14:18
 */
public class Solution_13
{
    public int romanToInt(String s)
    {
        int prev = Integer.MAX_VALUE;
        int total = 0;
        int temp = 0;
        for (char c : s.toCharArray())
        {
            int cur;
            switch (c)
            {
                case 'I':
                    cur = 1;
                    break;
                case 'V':
                    cur = 5;
                    break;
                case 'X':
                    cur = 10;
                    break;
                case 'L':
                    cur = 50;
                    break;
                case 'C':
                    cur = 100;
                    break;
                case 'D':
                    cur = 500;
                    break;
                case 'M':
                    cur = 1000;
                    break;
                default:
                    return -1;
            }

            if (prev > cur * 10)
            {
                total += temp;
                temp = cur;
            }
            else if (prev < cur)
            {
                total += cur - temp;
                temp = 0;
            }
            else if (prev == cur)
            {
                temp += cur;
            }
            else
            {
                total += temp;
                temp = cur;
                // prev > cur && prev <= cur * 10
            }
            prev = cur;
        }
        total += temp;
        return total;
    }
}
