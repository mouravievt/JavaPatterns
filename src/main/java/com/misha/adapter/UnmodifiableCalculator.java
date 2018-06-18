package com.misha.adapter;


/**
 * This is unmodifiable third party class that we are trying to use an adapter class for.
 */
public class UnmodifiableCalculator {
    public double getArea(Rectangle rectangle){
        return rectangle.getLength() * rectangle.getWidth();
    }
}
