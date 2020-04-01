package easy;

/**
 * 100. Same Tree
 * <p>
 * Given two binary trees, write a function to check if they are the same or not.
 * <p>
 * Two binary trees are considered the same if they are structurally identical and the nodes have the same value.
 * <p>
 * Example 1:
 * <p>
 * Input:     1         1
 * / \       / \
 * 2   3     2   3
 * <p>
 * [1,2,3],   [1,2,3]
 * <p>
 * Output: true
 * Example 2:
 * <p>
 * Input:     1         1
 * /           \
 * 2             2
 * <p>
 * [1,2],     [1,null,2]
 * <p>
 * Output: false
 * Example 3:
 * <p>
 * Input:     1         1
 * / \       / \
 * 2   1     1   2
 * <p>
 * [1,2,1],   [1,1,2]
 * <p>
 * Output: false
 *
 * @author mrc
 * Date: 2019/12/27 0027
 * Time: 12:59
 */
public class Solution_100
{
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == q)
            return true;
        if(p == null || q == null || p.val != q.val)
            return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    class TreeNode
    {
        int      val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x)
        {
            val = x;
        }
    }
}