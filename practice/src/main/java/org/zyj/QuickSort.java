package org.zyj;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Random;

@Slf4j
public class QuickSort {

    public static int[] sort(int[] ints) {
        if (ints.length < 2) {
            return ints;
        }
        Random random = new Random();
        int mid = ints[random.nextInt(ints.length-1)];
        log.info("快速排序，选择的基准值:{}", mid);
        int[] small = new int[ints.length];
        int[] big = new int[ints.length];
        int smallIndex = 0, bigIndex = 0;
        for (int anInt : ints) {
            if (anInt < mid) {
                small[smallIndex] = anInt;
                smallIndex++;
            }
            if (anInt > mid) {
                big[bigIndex] = anInt;
                bigIndex++;
            }
        }

        int[] dest = new int[ints.length];
        if (smallIndex > 0) {
            int[] smallResult = new int[smallIndex];
            System.arraycopy(small, 0, smallResult, 0, smallIndex);
            log.info("快速排序，小数组:{}", Arrays.toString(smallResult));
            int[] smallSort = sort(smallResult);
            System.arraycopy(smallSort, 0, dest, 0, smallSort.length);
        }
        dest[smallIndex] = mid;
        if (bigIndex > 0) {
            int[] bigResult = new int[bigIndex];
            System.arraycopy(big, 0, bigResult, 0, bigIndex);
            log.info("快速排序，大数组:{}", Arrays.toString(bigResult));
            int[] bigSort = sort(bigResult);
            System.arraycopy(bigSort, 0, dest, smallIndex + 1, bigSort.length);
        }
        return dest;
    }
}
