package TopKth;

/**
 * @Author: Bojun Ji
 * @Description:
 * @Date: 2018/10/1_1:41 AM
 */
public class KthLargestElementInAnArrayQuickSelect {
    public int findKthLargest(int[] nums, int k) {
        return quickSelect(nums, 0, nums.length - 1, k);
    }

    private int quickSelect(int[] nums, int low, int high, int k) {
        int temp = nums[low];
        int start = low;
        int end = high;
        while (start < end) {
            while (start < end && temp <= nums[end]) {
                end--;
            }
            nums[start] = nums[end];
            while (start < end && temp >= nums[start]) {
                start++;
            }
            nums[end] = nums[start];
        }
        nums[start] = temp;


        if (high - start + 1 == k) {
            return nums[start];
        } else if (high - start + 1 > k) {
            return quickSelect(nums, start + 1, high, k);
        } else {
            return quickSelect(nums, low, start - 1, k - (high - start + 1));
        }
    }
}
