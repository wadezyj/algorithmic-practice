package org.zyj;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayMaxTest {

    @Test
    public void max() {
        int[] ints = {1,7,2,6,4,9,8,0};
        Assert.assertEquals(9, ArrayMax.max(ints));
        ints = new int[]{1};
        Assert.assertEquals(1, ArrayMax.max(ints));
    }
}