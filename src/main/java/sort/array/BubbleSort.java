package sort.array;

import utils.ArrayUtils;

/**
 * @author charlie
 * @date 4/13/2023 3:47 PM
 **/
public class BubbleSort implements ArraySort {

    @Override
    public int[] sort(int[] arr) {
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            for (int j = i+1; j < length; j++) {
                if (arr[i] > arr[j]) {
                    arr = ArrayUtils.swap(arr, i, j);
                }
            }
        }
        return arr;
    }
}
