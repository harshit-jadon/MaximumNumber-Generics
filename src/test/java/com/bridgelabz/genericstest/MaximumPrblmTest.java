package com.bridgelabz.genericstest;

import com.bridgelabz.generics.MaximumProblem;
import org.junit.Assert;
import org.junit.Test;

public class MaximumPrblmTest {
    @Test
    public void givenInteger_ShouldReturnMaximum_WhenAtFirstPlace() {
       Integer result = MaximumProblem.maximumNumber(4, 2, 0);
        Assert.assertEquals(4,result.intValue());
    }

    @Test
    public void givenInteger_ShouldReturnMaximum_WhenAtSecondPlace() {
        Integer result = MaximumProblem.maximumNumber(3, 5, 4);
        Assert.assertEquals(5, result.intValue());
    }

    @Test
    public void givenInteger_ShouldReturnMaximum_WhenAtThirdPlace() {
        Integer result = MaximumProblem.maximumNumber(4, 6, 8);
        Assert.assertEquals(8, result.intValue());
    }

    @Test
    public void givenFloat_ShouldReturnMaximum_WhenAtFirstPlace() {
        Float result = MaximumProblem.maximumNumber(4.5f, 2.5f, 0.5f);
        Assert.assertEquals(4.5f,result.floatValue());
    }

    @Test
    public void givenFloat_ShouldReturnMaximum_WhenAtSecondPlace() {
        Float result = MaximumProblem.maximumNumber(3.5f, 5.5f, 4.5f);
        Assert.assertEquals(5.5f, result.floatValue());
    }

    @Test
    public void givenFloat_ShouldReturnMaximum_WhenAtThirdPlace() {
        Float result = MaximumProblem.maximumNumber(4.5f, 6.5f, 8.5f);
        Assert.assertEquals(8.5f, result.floatValue());
    }

    @Test
    public void givenString_ShouldReturnMaximum_WhenAtFirstPlace() {
        String result = MaximumProblem.maximumNumber("Peach", "Apple", "Banana");
        Assert.assertEquals("Peach", result);
    }

    @Test
    public void givenString_ShouldReturnMaximum_WhenAtSecondPlace() {
        String result = MaximumProblem.maximumNumber("Apple", "Peach", "Banana");
        Assert.assertEquals("Peach", result);
    }

    @Test
    public void givenString_ShouldReturnMaximum_WhenAtThirdPlace() {
        String result = MaximumProblem.maximumNumber("Banana", "Apple", "Peach");
        Assert.assertEquals("Peach", result);
    }

    @Test
    public void givenIntegerToGenericsClass_ShouldReturnMaximum_WhenAtFirstPlace() {
        MaximumProblem<Integer> test = new MaximumProblem<>(7,5,3);
        Assert.assertEquals(7,test.testMaximum().intValue());
    }
    @Test
    public void givenFloatToGenericsClass_ShouldReturnMaximum_WhenAtFirstPlace() {
        MaximumProblem test = new MaximumProblem(7.7f,5.5f,3.3f);
        Assert.assertEquals(7.7f,test.testMaximum());
    }
    @Test
    public void givenStringToGenericsClass_ShouldReturnMaximum_WhenAtFirstPlace() {
        MaximumProblem<String> test = new MaximumProblem<String>("Peach","Banana","Apple");
        Assert.assertEquals("Peach",test.testMaximum());
    }

}


