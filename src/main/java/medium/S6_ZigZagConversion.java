package medium;

/**
 * 6. ZigZag Conversion
 * Medium
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
 * <p>
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 * <p>
 * Write the code that will take a string and make this conversion given a number of rows:
 * <p>
 * string convert(string s, int numRows);
 * Example 1:
 * <p>
 * Input: s = "PAYPALISHIRING", numRows = 3
 * Output: "PAHNAPLSIIGYIR"
 * Example 2:
 * <p>
 * Input: s = "PAYPALISHIRING", numRows = 4
 * Output: "PINALSIGYAHRPI"
 * Explanation:
 * <p>
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 *
 * @author mrc
 * Date: 2020/6/10 0010
 * Time: 12:46
 */
public class S6_ZigZagConversion
{
    public String convert(String s, int numRows)
    {
        int len = (int) Math.ceil((double) s.length() / numRows);
        char[][] arr = new char[len][numRows];
        int arg = (numRows << 1) - 2;
        for (int i = 0; i < s.length(); i++)
        {
            int[] idxArr = calIndex(i, arg, numRows);
            arr[idxArr[0]][idxArr[1]] = s.charAt(i);
        }
        StringBuilder sb = new StringBuilder();
        for (char[] chars : arr)
        {
            for (char c : chars)
            {
                if (c > 0) sb.append(c);
            }
        }
        return sb.toString();
    }

    public int[] calIndex(int i, int arg, int numRows)
    {
        int a = i % arg;
        int b = i / arg;
        if (a >= numRows)
        {
            // 回头路上
        }
        else
        {

        }
        return null;
    }
}
