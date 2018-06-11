package com.misha.factory;

public abstract class AbstractAnimalFactory {
    public abstract Animal getAnimalOfType(String type) throws Exception;
}
