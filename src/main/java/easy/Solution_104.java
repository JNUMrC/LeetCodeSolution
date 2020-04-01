package easy;

/**
 * 104. Maximum Depth of Binary Tree
 * <p>
 * Given a binary tree, find its maximum depth.
 * <p>
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 * <p>
 * Note: A leaf is a node with no children.
 * <p>
 * Example:
 * <p>
 * Given binary tree [3,9,20,null,null,15,7],
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * return its depth = 3.
 *
 * @author mrc
 * Date: 2019/12/28 0028
 * Time: 14:45
 */
public class Solution_104
{
    public int maxDepth(TreeNode root)
    {
        return maxDepth(root, 0);
    }

    private int maxDepth(TreeNode p, int pd)
    {
        if(p == null) return pd;
        return Math.max(maxDepth(p.left, pd + 1), maxDepth(p.right, pd + 1));
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
