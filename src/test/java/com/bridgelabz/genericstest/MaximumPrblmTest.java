package com.bridgelabz.genericstest;

import com.bridgelabz.generics.MaximumProblem;
import org.junit.Assert;
import org.junit.Test;

public class MaximumPrblmTest {
    @Test
    public void toTest1stNumberIsMaximum() {
        MaximumProblem.maximumNumber(4,2,0);
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
    @Test
    public void toTest1stFloatIsMaximum() {
        Float result = MaximumProblem.maximumNumber(4.5f,2.5f,0.5f);
        Assert.assertEquals(4.5f,result);
    }
    @Test
    public void toTest2stFloatIsMaximum() {
        Float result = MaximumProblem.maximumNumber(3.5f,5.5f,4.5f);
        Assert.assertEquals(5.5f,result);
    }
    @Test
    public void toTest3stFloatIsMaximum() {
        Float result = MaximumProblem.maximumNumber(4.5f, 6.5f, 8.5f);
        Assert.assertEquals(8.5f, result);
    }
    @Test
    public void toTest1stStringIsMaximum() {
        String result = MaximumProblem.maximumNumber("Banana","Apple","Peach");
        Assert.assertEquals("Banana",result);
    }
    @Test
    public void toTest2stStringIsMaximum() {
        String result = MaximumProblem.maximumNumber("Apple","Banana","Peach");
        Assert.assertEquals("Banana",result);
    }
    @Test
    public void toTest3stStringIsMaximum() {
        String result = MaximumProblem.maximumNumber("Apple","Peach","Banana");
        Assert.assertEquals("Banana",result);
    }

}
