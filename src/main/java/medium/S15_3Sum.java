package medium;

import java.util.*;

/**
 * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 * <p>
 * Note:
 * <p>
 * The solution set must not contain duplicate triplets.
 * <p>
 * Example:
 * <p>
 * Given array nums = [-1, 0, 1, 2, -1, -4],
 * <p>
 * A solution set is:
 * [
 * [-1, 0, 1],
 * [-1, -1, 2]
 * ]
 *
 * @author mrc
 * Date: 2020/8/5 0005
 * Time: 12:52
 */
public class S15_3Sum {
    public static void main(String[] args) {
        int[] res = {-4, -2, -2, -2, 0, 1, 2, 2, 2, 3, 3, 4, 4, 6, 6};
        int[] res1 = {-1, -1, 0, 1};
        printArr(res);
        printArr(res1);
    }

    private static void printArr(int[] res) {
        for (List<Integer> list : new S15_3Sum().threeSum(res)) {
            System.out.println(Arrays.toString(list.toArray()));
        }
    }
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new LinkedList<>();
        for (int i = 0; i < nums.length - 2 && nums[i] <= 0; i++) {
            if((i == 0 || nums[i] != nums[i - 1])) {
                int lo = i + 1, hi = nums.length - 1, sum = - nums[i];
                while (lo < hi) {
                    if(nums[lo] + nums[hi] == sum) {
                        res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                        while (lo < hi && nums[lo] == nums[lo + 1]) lo++;
                        while (lo < hi && nums[hi] == nums[hi - 1]) hi--;
                        lo++;
                        hi--;
                    } else if(nums[lo]  + nums[hi] < sum) lo++;
                    else hi--;
                }
            }
        }
        return res;
    }

    public List<List<Integer>> threeSum1(int[] nums) {
        if(nums.length == 0) return new LinkedList<>();
        Arrays.sort(nums);
        Map<Integer, Integer> numAndCount = new HashMap<>();
        for (int num : nums) {
            numAndCount.merge(num, 1, Integer::sum);
        }
        List<List<Integer>> rs = new LinkedList<>();
        int lastA = nums[0] + 1;
        for (int i = 0; i < nums.length - 1; i++) {
            int lastB = nums[i+1] + 1;
            Integer a = nums[i];
            if(a.equals(lastA)) continue;
            lastA = a;
            for (int j = i + 1; j < nums.length; j++) {
                Integer b = nums[j];
                if(b.equals(lastB)) continue;
                lastB = b;
                int target = -(a + b);
                // 防止重复
                if(target < b) continue;
                Integer num = numAndCount.get(target);
                if(num == null) continue;
                if(target == a) num--;
                if(target == b) num--;
                if(num > 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(a);
                    list.add(b);
                    list.add(target);
                    rs.add(list);
                }
            }
        }
        return rs;
    }
}
