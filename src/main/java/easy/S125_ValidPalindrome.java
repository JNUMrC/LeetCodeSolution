package easy;

/**
 * 125. Valid Palindrome
 * Easy
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * <p>
 * Note: For the purpose of this problem, we define empty string as valid palindrome.
 * <p>
 * Example 1:
 * <p>
 * Input: "A man, a plan, a canal: Panama"
 * Output: true
 * Example 2:
 * <p>
 * Input: "race a car"
 * Output: false
 *
 * @author mrc
 * Date: 2020/4/2 0002
 * Time: 12:35
 */
public class S125_ValidPalindrome
{
    public static void main(String[] args)
    {
        System.out.println(new S125_ValidPalindrome().isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(new S125_ValidPalindrome().isPalindrome("race a car"));
    }

    public boolean isPalindrome(String s)
    {
        int i = 0, j = s.length() - 1;
        while (i < j)
        {
            char a = 0, b = 0;
            while (i < j && !Character.isLetterOrDigit(a = s.charAt(i))) i++;
            while (i < j && !Character.isLetterOrDigit(b = s.charAt(j))) j--;
            if(i < j)
            {
                if(Character.toLowerCase(a) != Character.toLowerCase(b)) return false;
                i++;
                j--;
            }
        }
        return true;
    }

//    public boolean isPalindrome(String s)
//    {
//        if(s == null) return true;
//        s = s.toLowerCase();
//        s = s.replaceAll("[^a-z0-9]", "");
//        for (int i = 0, j = s.length() - 1; i < j; i++, j--)
//        {
//            if(s.charAt(i) != s.charAt(j)) return false;
//        }
//        return true;
//    }
}
