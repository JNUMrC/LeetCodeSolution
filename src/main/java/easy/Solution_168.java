package easy;

import java.util.ArrayList;

/**
 * 168. Excel Sheet Column Title
 * Easy
 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.
 * <p>
 * For example:
 * <p>
 * 1 -> A
 * 2 -> B
 * 3 -> C
 * ...
 * 26 -> Z
 * 27 -> AA
 * 28 -> AB
 * ...
 * Example 1:
 * <p>
 * Input: 1
 * Output: "A"
 * Example 2:
 * <p>
 * Input: 28
 * Output: "AB"
 * Example 3:
 * <p>
 * Input: 701
 * Output: "ZY"
 *
 * @author mrc
 * Date: 2020/4/8 0008
 * Time: 12:21
 */
public class Solution_168
{
    public static void main(String[] args)
    {
        System.out.println(new Solution_168().convertToTitle(1));
        System.out.println(new Solution_168().convertToTitle(28));
        System.out.println(new Solution_168().convertToTitle(52));
        System.out.println(new Solution_168().convertToTitle(701));
        System.out.println(new Solution_168().convertToTitle(702));
        System.out.println(new Solution_168().convertToTitle(703));
    }
    public String convertToTitle(int n)
    {
        ArrayList<Integer> list = new ArrayList<>();
        while (n > 0)
        {
            list.add(n % 26);
            n /= 26;
        }
        for (int i = 0; i < list.size() - 1; i++)
        {
            if(list.get(i) == 0)
            {
                list.set(i, 26);
                list.set(i + 1, list.get(i + 1) - 1);
            }
        }
        int size = list.get(list.size() - 1) == 0 ? list.size() - 1 : list.size();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++)
        {
            sb.insert(0, getChar(list.get(i)));
        }
        return sb.toString();
    }

    public char getChar(int c)
    {
        switch (c)
        {
            case 1:
                return 'A';
            case 2:
                return 'B';
            case 3:
                return 'C';
            case 4:
                return 'D';
            case 5:
                return 'E';
            case 6:
                return 'F';
            case 7:
                return 'G';
            case 8:
                return 'H';
            case 9:
                return 'I';
            case 10:
                return 'J';
            case 11:
                return 'K';
            case 12:
                return 'L';
            case 13:
                return 'M';
            case 14:
                return 'N';
            case 15:
                return 'O';
            case 16:
                return 'P';
            case 17:
                return 'Q';
            case 18:
                return 'R';
            case 19:
                return 'S';
            case 20:
                return 'T';
            case 21:
                return 'U';
            case 22:
                return 'V';
            case 23:
                return 'W';
            case 24:
                return 'X';
            case 25:
                return 'Y';
            case 26:
            default:
                return 'Z';
        }
    }

}
