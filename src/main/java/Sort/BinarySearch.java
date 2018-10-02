package Sort;

/**
 * @Author: Bojun Ji
 * @Description:
 * @Date: 2018/10/2_6:21 PM
 */
public class BinarySearch {

    public int binarySearch(int[] nums, int i) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == i) {
                return mid;
            } else if (nums[mid] > i) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(binarySearch.binarySearch(nums, 6));
    }
}
