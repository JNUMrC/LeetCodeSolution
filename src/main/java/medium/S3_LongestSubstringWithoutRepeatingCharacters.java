package medium;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * 3. Longest Substring Without Repeating Characters
 * Medium
 * Given a string, find the length of the longest substring without repeating characters.
 * <p>
 * Example 1:
 * <p>
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 * <p>
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 * <p>
 * Input: "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 *
 * @author mrc
 * Date: 2020/6/6 0006
 * Time: 13:08
 */
public class S3_LongestSubstringWithoutRepeatingCharacters
{
    public static void main(String[] args)
    {
        System.out.println((int)Character.MAX_VALUE);
    }

    public int lengthOfLongestSubstring(String s)
    {
        if(s.length() == 0) return 0;
        int max = 0;
        // 当前最长不重复序列长度
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0, j = 0; i < s.length(); ++i)
        {
            if(map.containsKey(s.charAt(i)))
            {
                j = Math.max(j, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - j + 1);
        }
        return max;
    }

    public int lengthOfLongestSubstring_1(String s)
    {
        // 当前最长不重复序列长度
        int max = 0;
        // 当前不重复序列中元素
        int[] arr = new int[512];
        // 最近不重复序列
        Deque<Character> deque = new LinkedList<>();
        int t = 0;
        for (char c : s.toCharArray())
        {
            if (arr[c] == 1)
            {
                Character first;
                while ((first = deque.removeFirst()) != c)
                {
                    t--;
                    arr[first] = 0;
                }
            }
            else
            {
                arr[c] = 1;
                t++;
                if (t > max)
                    max++;
            }
            deque.addLast(c);
        }

        return max;
    }
}
