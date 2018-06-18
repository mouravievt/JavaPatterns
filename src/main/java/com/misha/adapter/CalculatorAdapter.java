package com.misha.adapter;

/**
 * This implements object adapter.
 * @link: https://www.safaribooksonline.com/library/view/java-design-patterns/9781484218020/9781484218013_Ch08.xhtml
 */
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