package easy;

import java.util.LinkedList;

/**
 * 20. Valid Parentheses
 * Easy
 * <p>
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 * <p>
 * Example 1:
 * <p>
 * Input: "()"
 * Output: true
 * Example 2:
 * <p>
 * Input: "()[]{}"
 * Output: true
 * Example 3:
 * <p>
 * Input: "(]"
 * Output: false
 * Example 4:
 * <p>
 * Input: "([)]"
 * Output: false
 * Example 5:
 * <p>
 * Input: "{[]}"
 * Output: true
 *
 * @author mrc
 * Date: 2019/11/7 0007
 * Time: 14:20
 */
public class S20_ValidParentheses
{
    public boolean isValid(String s)
    {
        if (s == null || s.isEmpty())
            return true;

        LinkedList<Character> stack = new LinkedList<>();
        for (char c : s.toCharArray())
        {
            switch (c)
            {
                case '(':
                case '[':
                case '{':
                {
                    stack.addLast(c);
                    break;
                }
                case ')':
                {
                    if (stack.isEmpty() || stack.removeLast() != '(')
                        return false;
                    break;
                }
                case ']':
                {
                    if (stack.isEmpty() || stack.removeLast() != '[')
                        return false;
                    break;
                }
                case '}':
                {
                    if (stack.isEmpty() || stack.removeLast() != '{')
                        return false;
                    break;
                }
                default:
                    break;
            }
        }

        return stack.isEmpty();
    }
}
