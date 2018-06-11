package com.misha.factory;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FactoryTest {
    private ConcreteAnimalFactory victim = new ConcreteAnimalFactory();

    @DataProvider(name = "dataprovider")
    public Object[][] provideData(){
        return new Object[][] {
                {"Goose", "honk"},
                {"Tiger", "meow"}
        };
    }

    @Test(dataProvider = "dataprovider")
    public void testAnimals(String animalType, String expectedNoise){
        try {
            Animal actualAnimal = victim.getAnimalOfType(animalType);
            Assert.assertEquals(actualAnimal.noise(), expectedNoise);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
