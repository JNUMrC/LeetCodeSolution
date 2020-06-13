package easy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 226. Invert Binary Tree
 * Easy
 * Invert a binary tree.
 *
 * Example:
 *
 * Input:
 *
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 * Output:
 *
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
 * Trivia:
 * This problem was inspired by this original tweet by Max Howell:
 *
 * Google: 90% of our engineers use the software you wrote (Homebrew), but you can’t invert a binary tree on a whiteboard so f*** off.
 *
 * @author mrc
 * Date: 2020/5/18 0018
 * Time: 12:46
 */
public class S226_InvertBinaryTree
{
    /**
     * 广度优先搜索（BFS）非递归
     * 从尾巴添加，从头取出
     */
    public TreeNode invertTree(TreeNode root)
    {
        if(root == null) return null;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty())
        {
            TreeNode node = queue.poll();
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
            if(node.left != null) queue.offer(node.left);
            if(node.right != null) queue.offer(node.right);
        }
        return root;
    }

    /**
     * 深度优先搜索（DFS）非递归
     * 从顶放，从顶取
     */
    public TreeNode invertTree_1(TreeNode root)
    {
        if(root == null) return null;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty())
        {
            TreeNode node = stack.pop();
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
            if(node.left != null) stack.push(node.left);
            if(node.right != null) stack.push(node.right);
        }
        return root;
    }

    /**
     * 递归解
     */
    public TreeNode invertTree_2(TreeNode root)
    {
        if (root != null)
        {
            TreeNode temp = root.left;
            root.left = invertTree(root.right);
            root.right = invertTree(temp);
        }
        return root;
    }

    /**
     * Definition for a binary tree node.
     */
    public class TreeNode
    {
        int      val;
        TreeNode left;
        TreeNode right;

        TreeNode()
        {
        }

        TreeNode(int val)
        {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right)
        {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
