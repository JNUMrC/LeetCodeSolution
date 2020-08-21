package medium;

/**
 * 11. Container With Most Water
 * Medium
 *
 * 6623
 *
 * 605
 *
 * Add to List
 *
 * Share
 * Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.
 *
 * Note: You may not slant the container and n is at least 2.
 *
 * The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
 *
 * Example:
 *
 * Input: [1,8,6,2,5,4,8,3,7]
 * Output: 49
 *
 * @author mrc
 * Date: 2020/8/19 0019
 * Time: 12:28
 */
public class S11_ContainerWithMostWater {
    public static void main(String[] args) {

    }

    /**
     * 时间复杂度O(n)
     * 从两边往中间比，left、right两个下标，
     * 对于两者中较小的数，与当前另外一个数的组合已经是最优了，
     * 所以较小的下标向内移动一位继续判断。
     */
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int max = (j - i) * Math.min(height[i], height[j]);
        while (i != j) {
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
            max = Math.max(max, (j - i) * Math.min(height[i], height[j]));
        }
        return max;
    }
}
