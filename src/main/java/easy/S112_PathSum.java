package easy;

/**
 * 112. Path Sum
 *
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
 *
 * Note: A leaf is a node with no children.
 *
 * Example:
 *
 * Given the below binary tree and sum = 22,
 *
 *       5
 *      / \
 *     4   8
 *    /   / \
 *   11  13  4
 *  /  \      \
 * 7    2      1
 * return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
 *
 * @author mrc
 * Date: 2019/12/28 0028
 * Time: 17:36
 */
public class S112_PathSum
{
    public boolean hasPathSum(TreeNode root, int sum)
    {
        if(root == null) return false;
        return hasPathSum(root, sum, 0);
    }

    private boolean hasPathSum(TreeNode p, int sum, int n)
    {
        n += p.val;
        if(p.left == null && p.right == null) return n == sum;
        if(p.left == null) return hasPathSum(p.right, sum, n);
        if(p.right == null) return hasPathSum(p.left, sum, n);
        return hasPathSum(p.left, sum , n) || hasPathSum(p.right, sum, n);
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
