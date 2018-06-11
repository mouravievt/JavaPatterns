package com.misha.factory;

public class ConcreteAnimalFactory extends AbstractAnimalFactory {
    public Animal getAnimalOfType(String type) throws Exception {
       Animal animal = null;
        switch (type){
            case "Goose":
                animal = new Goose();
                break;
            case "Tiger":
                animal = new Tiger();
                break;
            default:
                throw new Exception("U fucked up! There are no animals of type " + type);
        }
        return animal;
    }
}
