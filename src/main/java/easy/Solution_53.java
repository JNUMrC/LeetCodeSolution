package easy;

/**
 * 53. Maximum Subarray
 * Easy
 * <p>
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 * <p>
 * Example:
 * <p>
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * Follow up:
 * <p>
 * If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 *
 * @author mrc
 * Date: 2019/11/7 0007
 * Time: 17:55
 */
public class Solution_53
{
    public int maxSubArray(int[] nums)
    {
        if (nums == null || nums.length == 0)
            return 0;

        return maxSubArr(nums, 0, nums.length - 1);
    }

    public int maxSubArr(int[] nums, int low, int high)
    {
        if (high - low < 10)
        {
            int max = Integer.MIN_VALUE;
            for (int i = low; i <= high; i++)
            {
                int subMax = Integer.MIN_VALUE;
                int sum = 0;
                for (int j = i; j <= high; j++)
                {
                    sum += nums[j];
                    if (sum > subMax)
                        subMax = sum;
                }
                if (subMax > max)
                    max = subMax;
            }
            return max;
        }

        if (low >= high)
            return nums[low];

        int mid = (low + high) / 2;
        int maxLeft = maxSubArr(nums, low, mid);
        int maxRight = maxSubArr(nums, mid + 1, high);
        int maxAcross = maxSubAcrossMidArr(nums, low, mid, high);

        int max = maxLeft;
        if (maxRight > max)
            max = maxRight;
        if (maxAcross > max)
            max = maxAcross;
        return max;
    }

    public int maxSubAcrossMidArr(int[] nums, int low, int mid, int high)
    {
        int rightMax = nums[mid + 1];
        int rightSum = rightMax;
        for (int i = mid + 2; i <= high; i++)
        {
            rightSum += nums[i];
            if (rightSum > rightMax)
            {
                rightMax = rightSum;
            }
        }
        int leftMax = nums[mid];
        int leftSum = leftMax;
        for (int i = mid - 1; i >= low; i--)
        {
            leftSum += nums[i];
            if (leftSum > leftMax)
            {
                leftMax = leftSum;
            }
        }

        if (leftMax > 0)
            return rightMax > 0 ? leftMax + rightMax : leftMax;

        if (rightMax > 0)
            return rightMax;

        return Math.max(leftMax, rightMax);
    }
}
