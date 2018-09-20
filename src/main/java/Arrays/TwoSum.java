package Arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Bojun Ji
 * @Date: Created in 2018-09-20 14:43
 * @Description:
 */
public class TwoSum {
    public static void main(String[] args) {

    }

    /**
     * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
     * <p>
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * <p>
     * Example:
     * <p>
     * Given nums = [2, 7, 11, 15], target = 9,
     * <p>
     * Because nums[0] + nums[1] = 2 + 7 = 9,
     * return [0, 1].
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int j = target - nums[i];
            if (map.containsKey(j)) {
                return new int[]{i, map.get(j)};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
