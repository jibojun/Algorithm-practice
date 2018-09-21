package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

/**
 * @Author: Bojun Ji
 * @Date: Created in 2018-09-21 15:51
 * @Description:
 */
public class DegreeOfAnArray {

    /**
     * Given a non-empty array of non-negative integers nums, the degree of this array is defined as the maximum frequency of any one of its elements.
     * <p>
     * Your task is to find the smallest possible length of a (contiguous) subarray of nums, that has the same degree as nums.
     * <p>
     * Example 1:
     * Input: [1, 2, 2, 3, 1]
     * Output: 2
     * Explanation:
     * The input array has a degree of 2 because both elements 1 and 2 appear twice.
     * Of the subarrays that have the same degree:
     * [1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
     * The shortest length is 2. So return 2.
     * Example 2:
     * Input: [1,2,2,3,1,4,2]
     * Output: 6
     * Note:
     * <p>
     * nums.length will be between 1 and 50,000.
     * nums[i] will be an integer between 0 and 49,999.
     *
     * @param nums
     * @return
     */
    public int findShortestSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(nums[i], list);
            } else {
                List<Integer> list = map.get(nums[i]);
                list.add(i);
                map.put(nums[i], list);
            }
        }
        int degree = 0;
        int result = 0;
        for (Map.Entry<Integer, List<Integer>> item : map.entrySet()) {
            List<Integer> list = item.getValue();
            if (list.size() > degree) {
                degree = list.size();
                result = list.get(list.size() - 1) - list.get(0) + 1;
            } else if (list.size() == degree) {
                result = Math.min(result, list.get(list.size() - 1) - list.get(0) + 1);
            }
        }
        return result;
    }
}
