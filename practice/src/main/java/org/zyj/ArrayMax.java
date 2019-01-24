package org.zyj;

public class ArrayMax {

    public static int max(int[] ints) {
        if (ints.length == 0) {
            return 0;
        }
        if (ints.length == 1) {
            return ints[0];
        }
        int[] newArray = new int[ints.length-1];
        System.arraycopy(ints, 1, newArray, 0, ints.length - 1);
        int max = max(newArray);
        if(ints[0] > max){
            return ints[0];
        }
        return max;
    }
}
