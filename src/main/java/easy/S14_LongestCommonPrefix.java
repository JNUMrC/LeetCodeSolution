package easy;

/**
 * 14. Longest Common Prefix
 * Easy
 * <p>
 * Write a function to find the longest common prefix string amongst an array of strings.
 * <p>
 * If there is no common prefix, return an empty string "".
 * <p>
 * Example 1:
 * <p>
 * Input: ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 * <p>
 * Input: ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * Note:
 * <p>
 * All given inputs are in lowercase letters a-z.
 *
 * @author mrc
 * Date: 2019/11/7 0007
 * Time: 14:19
 */
public class S14_LongestCommonPrefix
{
    public String longestCommonPrefix(String[] strs)
    {
        if (strs == null || strs.length == 0 || strs[0].length() == 0)
            return "";

        if (strs.length == 1)
            return strs[0];

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Integer.MAX_VALUE; i++)
        {
            if (strs[0].length() <= i)
                return sb.toString();

            char cur = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++)
            {
                if (strs[j].length() <= i || strs[j].charAt(i) != cur)
                    return sb.toString();
            }

            sb.append(cur);
        }

        return sb.toString();
    }
}
