package com.misha.adapter;


import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorAdapterTest {

    private CalculatorAdapter victim = null;

    @BeforeClass
    private void init (){
        victim = new CalculatorAdapter();
    }

   @DataProvider(name = "dataprovider")
    public Object[][] provideData(){
        return new Object[][]{
                {1, 1, .5},
                {1, 0, 0.0},
                {0, 1, 0.0},
                {0, 0, 0.0},
                {2, 4, 4.0},
                {3, 9, 13.5}
        };
    }

    @Test (dataProvider = "dataprovider")
    private void testAdapter(int height, int base, double expectedArea){
        Triangle triangle = new Triangle(height, base);

        Assert.assertEquals(victim.getArea(triangle), expectedArea);
    }
}
