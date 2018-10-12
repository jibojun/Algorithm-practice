package Sort;

import java.util.*;

/**
 * @Author: Bojun Ji
 * @Date: Created in 2018-09-28 19:48
 * @Description:
 */
public class IntersectionOfTwoArrays {

    /**
     * Given two arrays, write a function to compute their intersection.
     * <p>
     * Example 1:
     * <p>
     * Input: nums1 = [1,2,2,1], nums2 = [2,2]
     * Output: [2]
     * Example 2:
     * <p>
     * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
     * Output: [9,4]
     * Note:
     * <p>
     * Each element in the result must be unique.
     * The result can be in any order.
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Set<Integer> set = new HashSet<>();
        for (int i = 0, j = 0; i < nums1.length && j < nums2.length; ) {
            if (nums1[i] == nums2[j]) {
                set.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        int[] resultArray = new int[set.size()];
        Object[] objectArray = set.toArray();
        for (int i = 0; i < set.size(); i++) {
            resultArray[i] = (int) objectArray[i];
        }
        return resultArray;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 2, 1};
        int[] nums2 = new int[]{2, 2};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
}
