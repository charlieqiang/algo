package sort.array;

import utils.ArrayUtils;

/**
 * @author charlie
 * @date 4/13/2023 3:52 PM
 **/
public class SelectionSort implements ArraySort {

    @Override
    public int[] sort(int[] arr) {
        int length = arr.length;
        int min;

        for (int i = 0; i < length; i++) {
            min = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) {
                arr = ArrayUtils.swap(arr, i, min);
            }
        }
        return arr;
    }
}
