package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 119. Pascal's Triangle II
 * Easy
 * Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.
 * <p>
 * Note that the row index starts from 0.
 * <p>
 * <p>
 * In Pascal's triangle, each number is the sum of the two numbers directly above it.
 * <p>
 * Example:
 * <p>
 * Input: 3
 * Output: [1,3,3,1]
 * Follow up:
 * <p>
 * Could you optimize your algorithm to use only O(k) extra space?
 *
 * @author mrc
 * Date: 2020/4/1 0001
 * Time: 12:18
 */
public class S119_PascalsTriangleII
{
    public static void main(String[] args)
    {
        List<Integer> row = new S119_PascalsTriangleII().getRow(3);
        System.out.println(Arrays.toString(row.toArray()));
    }

    public List<Integer> getRow(int rowIndex)
    {
        if (rowIndex < 0) return new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++)
        {
            list.add(0);
        }
        return getRow(0, rowIndex, list);
    }

    private List<Integer> getRow(int cur, int rowIndex, List<Integer> list)
    {

        for (int i = cur; i >= 0; i--)
        {
            int left = i == 0 ? 0 : list.get(i - 1);
            int right = i == list.size() ? 0 : list.get(i);
            int sum = left + right;
            list.set(i, sum == 0 ? 1 : sum);
        }
        return cur == rowIndex ? list : getRow(++cur, rowIndex, list);
    }
}
