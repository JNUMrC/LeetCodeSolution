package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 118. Pascal's Triangle
 *
 * Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
 *
 *
 * In Pascal's triangle, each number is the sum of the two numbers directly above it.
 *
 * Example:
 *
 * Input: 5
 * Output:
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 *
 * @author mrc
 * Date: 2019/12/28 0028
 * Time: 17:56
 */
public class S118_PascalsTriangle
{
    public static void main(String[] args)
    {
        new S118_PascalsTriangle().generate(5);
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> r = new ArrayList<>();
        for (int i = 0; i < numRows; i++)
        {
            List<Integer> list1 = new ArrayList<>();
            for (int j = 0; j <= i; j++)
            {
                list1.add((j == 0 || j == i)? 1 : (r.get(i - 1).get(j - 1) + r.get(i - 1).get(j)));
            }
            r.add(list1);
        }
        return r;
    }
}
