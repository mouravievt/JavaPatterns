package com.misha.adapter;

public class CalculatorAdapter {
    UnmodifiableCalculator calculator;
    Triangle triangle;

    public double getArea(Triangle triangle) {
        calculator = new UnmodifiableCalculator();

        //Area of Triangle=0.5*base*height     
        Rectangle rectangle = new Rectangle(triangle.getHeight(), .5 * triangle.getBase());
        return calculator.getArea(rectangle);
    }
}