package medium;

/**
 * 5. Longest Palindromic Substring
 * Medium
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
 * <p>
 * Example 1:
 * <p>
 * Input: "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 * Example 2:
 * <p>
 * Input: "cbbd"
 * Output: "bb"
 *
 * @author mrc
 * Date: 2020/8/3 0003
 * Time: 23:27
 */
public class S5_LongestPalindromicSubstring
{
    public static void main(String[] args)
    {
        System.out.println(new S5_LongestPalindromicSubstring().longestPalindrome("babad"));
        System.out.println(new S5_LongestPalindromicSubstring().longestPalindrome("cbbd"));
        System.out.println(new S5_LongestPalindromicSubstring().longestPalindrome("a"));
    }

    private int begin;
    private int maxLen;

    public String longestPalindrome(String s)
    {
        if(s.length() < 2) return s;
        // 从中间往两边判断
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length - 1; ++i)
        {
            longestPalindrome(chars, i, i);
            longestPalindrome(chars, i, i + 1);
        }
        return s.substring(begin, begin + maxLen);
    }

    private void longestPalindrome(char[] chars, int a, int b)
    {
        while (a >= 0 && b < chars.length && chars[a] == chars[b])
        {
            a--;
            b++;
        }
        if (b - a - 1 > maxLen)
        {
            begin = a + 1;
            maxLen = b - a - 1;
        }
    }

    public String longestPalindrome_1(String s)
    {
        // 从两边往中间，会重复判断一些。
        char[] chars = s.toCharArray();
        for (int a = chars.length - 1; a >= 0; --a)
        {
            for (int b = 0; a + b < chars.length; b++)
            {
                int left = b;
                int right = a + b;
                boolean isPalindrome = true;
                while (left < right)
                {
                    if (chars[left] != chars[right])
                    {
                        isPalindrome = false;
                        break;
                    }
                    left++;
                    right--;
                }
                if (isPalindrome) return s.substring(b, a + b + 1);
            }
        }
        return "";
    }
}
