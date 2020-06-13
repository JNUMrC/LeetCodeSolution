package easy;

/**
 * 108. Convert Sorted Array to Binary Search Tree
 * <p>
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 * <p>
 * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 * <p>
 * Example:
 * <p>
 * Given the sorted array: [-10,-3,0,5,9],
 * <p>
 * One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:
 * <p>
 * 0
 * / \
 * -3   9
 * /   /
 * -10  5
 *
 * @author mrc
 * Date: 2019/12/28 0028
 * Time: 15:51
 */
public class S108_ConvertSortedArrayToBinarySearchTree
{
    public TreeNode sortedArrayToBST(int[] nums)
    {
        if (nums == null || nums.length == 0) return null;

        int mid = nums.length / 2;
        TreeNode root = new TreeNode(nums[mid]);
        sortedArrayToBST(nums, root, 0, mid, true);
        sortedArrayToBST(nums, root, mid + 1, nums.length, false);
        return root;
    }

    private void sortedArrayToBST(int[] nums, TreeNode p, int begin, int end, boolean left)
    {
        if (begin >= end)
            return;

        int mid = (end + begin) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        if (left)
            p.left = node;
        else p.right = node;
        sortedArrayToBST(nums, node, begin, mid, true);
        sortedArrayToBST(nums, node, mid + 1, end, false);
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
