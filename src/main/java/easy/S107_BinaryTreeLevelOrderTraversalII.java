package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 107. Binary Tree Level Order Traversal II
 *
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
 *
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its bottom-up level order traversal as:
 * [
 *   [15,7],
 *   [9,20],
 *   [3]
 * ]
 *
 * @author mrc
 * Date: 2019/12/28 0028
 * Time: 15:12
 */
public class S107_BinaryTreeLevelOrderTraversalII
{
    public List<List<Integer>> levelOrderBottom(TreeNode root)
    {
        List<List<Integer>> r = new ArrayList<>();
        levelOrderBottom(root, r, 0);
        return r;
    }

    private void levelOrderBottom(TreeNode p, List<List<Integer>> r, int d)
    {
        if(p == null) return;
        while (r.size() <= d)
            r.add(0, new ArrayList<>());
        r.get(r.size() - d - 1).add(p.val);
        levelOrderBottom(p.left, r, d + 1);
        levelOrderBottom(p.right, r, d + 1);
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
