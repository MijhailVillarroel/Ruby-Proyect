package com.fundacionjala.figure;

/**
 * Created by mijhailvillarroel on 6/20/2016.
 */
public class Circle extends Shape {

    private static final int FACTOR_FORMULA = 2;

    private final double radio;

    public Circle(double radio) {
        this.radio = radio;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radio, FACTOR_FORMULA);
    }

    public double calculatePerimeter() {
        return FACTOR_FORMULA * Math.PI * radio;
    }

}
