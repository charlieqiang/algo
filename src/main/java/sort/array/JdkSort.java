package sort.array;

import java.util.Arrays;

/**
 * @author charlie
 * @date 4/15/2023 10:15 AM
 **/
public class JdkSort implements ArraySort {

    @Override
    public int[] sort(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }
}
