package com.fundacionjala.figure;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mijhailvillarroel on 6/16/2016.
 */
public class TestCircle {

    public static final double RADIO = 5.5;

    private Shape circle;

    @Before
    public void setup() {
        circle = new Circle(RADIO);
    }

    @Test
    public void testCalculateArea() {
        final double expectResultArea = 95.0334;
        assertEquals(expectResultArea, circle.calculateArea(), Constant.DELTA);
    }

    @Test
    public void testCalculatePerimeter() {
        final double expectResultPerimeter = 34.55;
        assertEquals(expectResultPerimeter, circle.calculatePerimeter(), Constant.DELTA);
    }
}
