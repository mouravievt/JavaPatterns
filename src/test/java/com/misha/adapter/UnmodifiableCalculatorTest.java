package com.misha.adapter;


import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UnmodifiableCalculatorTest {

    private UnmodifiableCalculator victim = null;

    @BeforeClass
    private void init (){
        victim = new UnmodifiableCalculator();
    }

   @DataProvider(name = "dataprovider")
    public Object[][] provideData(){
        return new Object[][]{
                {1, 1, 1.0},
                {1, 0, 0.0},
                {0, 1, 0.0},
                {0, 0, 0.0},
                {2, 4, 8.0}
        };
    }

    @Test (dataProvider = "dataprovider")
    private void testCalculator(int length, int width, double expectedArea){
        Rectangle rectangle = new Rectangle(length, width);

        Assert.assertEquals(victim.getArea(rectangle), expectedArea);
    }
}
