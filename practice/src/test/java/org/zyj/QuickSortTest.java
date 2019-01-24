package org.zyj;

import org.junit.Test;

import java.util.Arrays;

public class QuickSortTest {

    @Test
    public void sort() {
        int[] ints = {1,7,2,6,4,9,8,0};
        System.out.println(Arrays.toString(QuickSort.sort(ints)));
    }
}