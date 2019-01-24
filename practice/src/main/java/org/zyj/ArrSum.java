package org.zyj;

public class ArrSum {

    public static int sum(int[] ints) {
        if (ints.length == 0) {
            return 0;
        }
        if (ints.length == 1) {
            return ints[0];
        }
        int[] newArray = new int[ints.length-1];
        System.arraycopy(ints, 1, newArray, 0, ints.length - 1);
        return ints[0] + sum(newArray);
    }
}
