package Sort;

import java.util.Arrays;

/**
 * @Author: Bojun Ji
 * @Date: Created in 2018-09-25 15:12
 * @Description:
 */
public class QuickSort {

    public void quickSort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        sort(array, 0, array.length - 1);
    }

    public void sort(int[] array, int low, int high) {
        if (low > high) {
            return;
        }
        int start = low;
        int end = high;
        int key = array[low];
        while (start < end) {
            while (start < end && array[end] >= key) {
                end--;
            }
            while (start < end && array[start] <= key) {
                start++;
            }
            if (start < end) {
                int tmp = array[start];
                array[start] = array[end];
                array[end] = tmp;
            }
        }
        int tmp = array[low];
        array[low] = array[start];
        array[start] = tmp;
        sort(array, low, start - 1);
        sort(array, start + 1, high);
    }

    public static void main(String[] args) {
        int[] a = {3, 4, 6, 5, 7, 8, 6, 0};
        System.out.println(Arrays.toString(a));
        QuickSort q = new QuickSort();
        q.quickSort(a);
        System.out.println(Arrays.toString(a));
    }
}
