package org.zyj;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrSumTest {

    @Test
    public void sum() {
        int[] ints = {2,4,6};
        Assert.assertEquals(12, ArrSum.sum(ints));
    }
}