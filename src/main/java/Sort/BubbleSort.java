package Sort;

import java.util.Arrays;

/**
 * @Author: Bojun Ji
 * @Date: Created in 2018-09-25 16:33
 * @Description:
 */
public class BubbleSort {
    public void bubbleSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {3, 4, 6, 5, 7, 8, 6, 0};
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println(Arrays.toString(a));
        bubbleSort.bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }
}
