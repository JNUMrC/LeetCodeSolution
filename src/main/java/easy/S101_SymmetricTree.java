package easy;

/**
 * 101. Symmetric Tree
 *
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 *
 * For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
 *
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 *
 *
 * But the following [1,2,2,null,3,null,3] is not:
 *
 *     1
 *    / \
 *   2   2
 *    \   \
 *    3    3
 *
 *
 * Note:
 * Bonus points if you could solve it both recursively and iteratively.
 *
 * @author mrc
 * Date: 2019/12/28 0028
 * Time: 13:34
 */
public class S101_SymmetricTree
{

    public boolean isSymmetric(TreeNode root)
    {
        if(root == null)
            return true;

        return compare(root.left, root.right);
    }

    private boolean compare(TreeNode a, TreeNode b)
    {
        if(a == null && b == null)
            return true;
        if(a == null || b == null || a.val != b.val)
            return false;
        return compare(a.left, b.right) && compare(a.right, b.left);
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
