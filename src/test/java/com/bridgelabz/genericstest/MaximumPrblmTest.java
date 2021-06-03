package com.bridgelabz.genericstest;

import com.bridgelabz.generics.MaximumProblem;
import org.junit.Assert;
import org.junit.Test;

public class MaximumPrblmTest {
    @Test
    public void toTest1stNumberIsMaximum() {
        Integer result = MaximumProblem.maximumNumber(4,2,0);
        Assert.assertEquals(4,result);
    }
    @Test
    public void totest2ndNumberIsMaximum() {
        Integer result = MaximumProblem.maximumNumber(3,5,4);
        Assert.assertEquals(5,result);
    }
    @Test
    public void totest3rdNumberIsMaximum() {
        Integer result = MaximumProblem.maximumNumber(4,6,8);
        Assert.assertEquals(8,result);
    }
}
