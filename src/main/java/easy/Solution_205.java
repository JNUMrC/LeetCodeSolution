package easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 205. Isomorphic Strings
 * Easy
 * Given two strings s and t, determine if they are isomorphic.
 * <p>
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 * <p>
 * All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "egg", t = "add"
 * Output: true
 * Example 2:
 * <p>
 * Input: s = "foo", t = "bar"
 * Output: false
 * Example 3:
 * <p>
 * Input: s = "paper", t = "title"
 * Output: true
 * Note:
 * You may assume both s and t have the same length.
 *
 * @author mrc
 * Date: 2020/5/14 0014
 * Time: 12:52
 */
public class Solution_205
{
    public static void main(String[] args)
    {
        System.out.println(new Solution_205().isIsomorphic("", ""));
        System.out.println(new Solution_205().isIsomorphic(null, ""));
        System.out.println(new Solution_205().isIsomorphic("", null));
        System.out.println(new Solution_205().isIsomorphic(null, null));
        System.out.println(new Solution_205().isIsomorphic("egg", "add"));
        System.out.println(new Solution_205().isIsomorphic("foo", "bar"));
        System.out.println(new Solution_205().isIsomorphic("paper", "title"));
    }


    public boolean isIsomorphic(String s, String t) {
        if(s == null && t == null) return true;
        if(s == null || t == null) return false;
        if(s.length() != t.length()) return false;
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++)
        {
            char a = s.charAt(i);
            char b = t.charAt(i);
            Character _b = map.putIfAbsent(a, b);
            if(_b != null && b != _b) return false;
        }
        Set<Character> set = new HashSet<>(map.values());
        return set.size() == map.size();
    }
//    public boolean isIsomorphic(String s, String t) {
//        if(s == null && t == null) return true;
//        if(s == null || t == null) return false;
//        if(s.length() != t.length()) return false;
//        Set<Character> setA = new HashSet<>();
//        Set<Character> setB = new HashSet<>();
//        for (int i = 0; i < s.length(); i++)
//        {
//            char a = s.charAt(i);
//            if(setA.contains(a)) continue;
//            setA.add(a);
//            char b = t.charAt(i);
//            if(setB.contains(b)) return false;
//            setB.add(b);
//            for (int j = i + 1; j < s.length(); j++)
//            {
//                if(s.charAt(j) == a && t.charAt(j) != b) return false;
//            }
//        }
//        return true;
//    }
}
