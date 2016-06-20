package com.fundacionjala.figure;

/**
 * Created by mijhailvillarroel on 6/16/2016.
 */
public class Rectangle extends Shape {

    public static final int FACTOR_FORMULA = 2;

    private final double sideA;

    private final double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double calculateArea() {
        return sideA * sideB;
    }

    public double calculatePerimeter() {
        return FACTOR_FORMULA * (sideA + sideB);
    }
}
