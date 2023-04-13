package utils;

/**
 * @author charlie
 * @date 4/13/2023 4:03 PM
 **/
public class ArrayUtils {
    public static int[] swap(int[] arr, int i, int j){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
        return arr;
    }
}
