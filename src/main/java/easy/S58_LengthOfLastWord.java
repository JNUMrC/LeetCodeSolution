package easy;

/**
 * 58. Length of Last Word
 * Easy
 * <p>
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 * <p>
 * If the last word does not exist, return 0.
 * <p>
 * Note: A word is defined as a character sequence consists of non-space characters only.
 * <p>
 * Example:
 * <p>
 * Input: "Hello World"
 * Output: 5
 *
 * @author mrc
 * Date: 2019/11/7 0007
 * Time: 19:55
 */
public class S58_LengthOfLastWord
{
    public int lengthOfLastWord(String s)
    {
        if (s == null || s.length() == 0)
            return 0;

        int n = 0;
        for (int i = s.length() - 1; i >= 0; i--)
        {
            if (s.charAt(i) == ' ')
            {
                if (n > 0)
                    return n;
            }
            else
                n++;
        }
        return n;
    }
}
