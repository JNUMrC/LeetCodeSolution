package easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 189. Rotate Array
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 * <p>
 * Example 1:
 * <p>
 * Input: [1,2,3,4,5,6,7] and k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * Example 2:
 * <p>
 * Input: [-1,-100,3,99] and k = 2
 * Output: [3,99,-1,-100]
 * Explanation:
 * rotate 1 steps to the right: [99,-1,-100,3]
 * rotate 2 steps to the right: [3,99,-1,-100]
 * Note:
 * <p>
 * Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
 * Could you do it in-place with O(1) extra space?
 */
public class Solution_189 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        new Solution_189().rotate(arr, 3);
        System.out.println(Arrays.toString(arr));
        arr = new int[]{-1, -100, 3, 99};
        new Solution_189().rotate(arr, 2);
        System.out.println(Arrays.toString(arr));
    }

    public void rotate(int[] nums, int k)
    {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public void rotate_3(int[] nums, int k) {
        int length = nums.length;
        int[] temp = new int[length];
        for (int i = 0; i < length; i++) {
            temp[(i + k) % length] = nums[i];
        }
        for (int i = 0; i < length; i++) {
            nums[i] = temp[i];
        }
    }

    public void rotate_2(int[] nums, int k) {
        if (nums.length == 0 || k == 0) return;
        while (k >= nums.length) k -= nums.length;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < k; i++) {
            int idx = i;
            int t = nums[idx];
            while (!set.contains(idx)) {
                set.add(idx);
                while ((idx += k) < nums.length) {
                    int m = t;
                    t = nums[idx];
                    nums[idx] = m;
                }
                idx -= nums.length;
                int m = nums[idx];
                nums[idx] = t;
                t = m;
            }
        }
    }

    public void rotate_1(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            int last = nums[nums.length - 1];
            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = last;
        }
    }

}
