package sort.arr;

import org.junit.Assert;
import org.junit.Test;
import sort.array.BubbleSort;
import sort.array.SelectionSort;

/**
 * @author charlie
 * @date 4/13/2023 3:47 PM
 **/
public class SortTest {

    @Test
    public void testBubbleSort() {
        int[] testArr01 = {1, 3, 2, 4, 5};
        int[] testArr02 = {1, 2, 4, 3, 5};
        int[] expectArr = {1, 2, 3, 4, 5};

        Assert.assertArrayEquals(expectArr, new BubbleSort().sort(testArr01));
        Assert.assertArrayEquals(expectArr, new BubbleSort().sort(testArr02));
    }

    @Test
    public void testSelectionSort() {
        int[] testArr01 = {1, 3, 2, 4, 5};
        int[] testArr02 = {1, 2, 4, 3, 5};
        int[] expectArr = {1, 2, 3, 4, 5};

        Assert.assertArrayEquals(expectArr, new SelectionSort().sort(testArr01));
        Assert.assertArrayEquals(expectArr, new SelectionSort().sort(testArr02));
    }
}
