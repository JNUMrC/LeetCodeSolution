package easy;

/**
 * 28. Implement strStr()
 * Easy
 * <p>
 * Implement strStr().
 * <p>
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * <p>
 * Example 1:
 * <p>
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 * Example 2:
 * <p>
 * Input: haystack = "aaaaa", needle = "bba"
 * Output: -1
 * Clarification:
 * <p>
 * What should we return when needle is an empty string? This is a great question to ask during an interview.
 * <p>
 * For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
 *
 * @author mrc
 * Date: 2019/11/7 0007
 * Time: 14:46
 */
public class S28_ImplementStrStr
{
    public int strStr(String haystack, String needle)
    {
        if (haystack == null)
            return -1;

        if (needle == null || needle.length() == 0)
            return 0;

        char[] haystackChars = haystack.toCharArray();
        char[] needleChars = needle.toCharArray();

        out:
        for (int i = 0; i <= haystackChars.length - needleChars.length; i++)
        {
            for (int j = 0; j < needleChars.length; j++)
            {
                if(haystackChars[i + j] != needleChars[j])
                    continue out;
            }

            return i;
        }
        return -1;
    }
}
