package com.misha.builder;


import org.testng.Assert;
import org.testng.annotations.*;

public class DirectorTest {

    private Director victim = null;

    //this will initialize director for every test invokation providing new director object.
    @BeforeMethod
    private void init (){
        victim = new Director();
    }

    @DataProvider(name = "dataprovider")
    public Object[][] provideData(){
        return new Object[][]{
                {"car", 4, 2, "Grey"},
                {"motorcycle", 2, 1, "Red"},
                {"tricycle", 3, 0, "Blue"}
        };
    }

    @Test(dataProvider = "dataprovider")
    private void testDirector(String vehicleType, int expectedWheels, int expectedLights, String expectedColor){
        Vehicle actual;

        switch (vehicleType){
            case "car":
                actual = victim.createCar();
                break;

            case "motorcycle":
                actual = victim.createMotorcycle();
                break;

            case "tricycle":
                actual = victim.createTricycle();
                break;

            default:
                actual = null;
                break;
        }

        Assert.assertEquals(actual.getNumberOfWheels(), expectedWheels);
        Assert.assertEquals(actual.getNumberOfLights(), expectedLights);
        Assert.assertEquals(actual.getColorOfVehicle(), expectedColor);
    }
}
