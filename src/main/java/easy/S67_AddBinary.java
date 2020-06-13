package easy;

/**
 * 67. Add Binary
 * Easy
 * <p>
 * Given two binary strings, return their sum (also a binary string).
 * <p>
 * The input strings are both non-empty and contains only characters 1 or 0.
 * <p>
 * Example 1:
 * <p>
 * Input: a = "11", b = "1"
 * Output: "100"
 * Example 2:
 * <p>
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 *
 * @author mrc
 * Date: 2019/11/7 0007
 * Time: 20:11
 */
public class S67_AddBinary
{
    public String addBinary(String a, String b)
    {
        StringBuilder sb = new StringBuilder();
        boolean f = false;

        String m = a.length() > b.length() ? a : b;
        String n = a.length() > b.length() ? b : a;
        int div = m.length() - n.length();

        for (int i = n.length() - 1; i >= 0; i--)
        {
            byte bt = (byte) (f ? 1 : 0);

            if(n.charAt(i) == '1')
                bt++;
            if(m.charAt(i + div) == '1')
                bt++;
            sb.insert(0, bt % 2);
            f = bt > 1;
        }

        for (int i = div - 1; i >= 0; i--)
        {
            byte bt = (byte) (f ? 1 : 0);
            if(m.charAt(i) == '1')
                bt++;
            sb.insert(0, bt % 2);
            f = bt > 1;
        }

        if(f)
            sb.insert(0, 1);

        return sb.toString();
    }
}
