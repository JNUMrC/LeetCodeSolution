package easy;

/**
 * 88. Merge Sorted Array
 *
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 *
 * Note:
 *
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
 * Example:
 *
 * Input:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 *
 * Output: [1,2,2,3,5,6]
 *
 * @author mrc
 * Date: 2019/12/27 0027
 * Time: 12:49
 */
public class S88_MergeSortedArray
{
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m];
        for (int i = 0; i < m; i++)
        {
            arr[i] = nums1[i];
        }
        int i = 0, j = 0;
        while (i < m && j < n)
        {
            nums1[i + j] = (arr[i] < nums2[j]) ? arr[i++] : nums2[j++];
        }
        while (i < m)
        {
            nums1[i + j] = arr[i++];
        }
        while (j < n)
        {
            nums1[i+ j] = nums2[j++];
        }
    }
}
