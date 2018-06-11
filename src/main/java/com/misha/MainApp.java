package com.misha;

import com.misha.factory.Animal;
import com.misha.factory.ConcreteAnimalFactory;
import org.apache.log4j.Logger;

public class MainApp {
    private static final Logger log = Logger.getLogger(MainApp.class);

    public static void main(String[] args){
        log.info("MainApp Started.");

        factoryFun();

        log.info("MainApp Finished.");
    }

    private static void factoryFun(){
        ConcreteAnimalFactory animalFactory = new ConcreteAnimalFactory();

        log.info("Here is my factory at work.");
        try {
            //creating a goose
            Animal goose = animalFactory.getAnimalOfType("Goose");
            log.info("My goose says " + goose.noise());
            //creating a tiger
            Animal tiger = animalFactory.getAnimalOfType("Tiger");
            log.info("My tiger says " + tiger.noise());
            //There is no Lion type. So, an exception will be thrown                
            Animal lion = animalFactory.getAnimalOfType("lion");
            log.info("My Lion says " + lion.noise());
        }catch (Exception ee){
            log.error(ee.getMessage(), ee);
        }
    }
}
