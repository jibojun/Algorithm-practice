package Sort;

import java.util.Arrays;

/**
 * @Author: Bojun Ji
 * @Date: Created in 2018-09-25 15:12
 * @Description:
 */
public class QuickSort {

    public void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int middle = getMiddle(array, low, high);
            getMiddle(array, low, middle - 1);
            getMiddle(array, middle + 1, high);
        }
    }

    public int getMiddle(int[] array, int low, int high) {
        int key = array[low];
        while (low < high) {
            while (low < high && array[high] >= key) {
                high--;
            }
            array[low] = array[high];
            while (low < high && array[low] <= key) {
                low++;
            }
            array[high] = array[low];
        }
        array[low] = key;
        return low;
    }

    public static void main(String[] args) {
        int[] a = {3, 4, 6, 5, 7, 8, 6, 0};
        System.out.println(Arrays.toString(a));
        QuickSort q = new QuickSort();
        q.quickSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}
