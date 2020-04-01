package easy;

/**
 * 110. Balanced Binary Tree
 * <p>
 * Given a binary tree, determine if it is height-balanced.
 * <p>
 * For this problem, a height-balanced binary tree is defined as:
 * <p>
 * a binary tree in which the left and right subtrees of every node differ in height by no more than 1.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Given the following tree [3,9,20,null,null,15,7]:
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * Return true.
 * <p>
 * Example 2:
 * <p>
 * Given the following tree [1,2,2,3,3,null,null,4,4]:
 * <p>
 * 1
 * / \
 * 2   2
 * / \
 * 3   3
 * / \
 * 4   4
 * Return false.
 *
 * @author mrc
 * Date: 2019/12/28 0028
 * Time: 16:22
 */
public class Solution_110
{
    public boolean isBalanced(TreeNode root)
    {
        return isBalanced(root, 0) >= 0;
    }

    private int isBalanced(TreeNode p, int pd)
    {
        if(p == null) return pd;
        int left = isBalanced(p.left, pd + 1);
        int right = isBalanced(p.right, pd + 1);
        if(left < 0 || right < 0)
            return -1;
        int max = Math.max(left, right);
        return Math.abs(left - right) > 1 ? -max : max;
    }

    public class TreeNode
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
