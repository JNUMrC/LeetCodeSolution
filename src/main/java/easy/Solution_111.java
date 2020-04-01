package easy;

/**
 * 111. Minimum Depth of Binary Tree
 * <p>
 * Given a binary tree, find its minimum depth.
 * <p>
 * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
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
 * return its minimum depth = 2.
 *
 * @author mrc
 * Date: 2019/12/28 0028
 * Time: 16:45
 */
public class Solution_111
{
    public int minDepth(TreeNode root)
    {
        return minDepth(root, 0);
    }

    private int minDepth(TreeNode p, int d)
    {
        if(p == null) return -d;
        if(p.left == null && p.right == null) return d + 1;
        int l = minDepth(p.left, d + 1);
        int r = minDepth(p.right, d + 1);
        if(l < 0) return r;
        if(r < 0) return l;
        return Math.min(l, r);
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
