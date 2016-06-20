package com.fundacionjala.figure;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mijhailvillarroel on 6/16/2016.
 */
public class TestRectangle {

    private static final double SIDE_A = 5.2;

    private static final double SIDE_B = 6.2;

    private Shape rectangle;

    @Before
    public void setup() {
        rectangle = new Rectangle(SIDE_A, SIDE_B);
    }

    @Test
    public void testCalculateArea() {
        final double expectResultArea = 32.24;
        assertEquals(expectResultArea, rectangle.calculateArea(), Constant.DELTA);
    }

    @Test
    public void testCalculatePerimeter() {
        final double expectResultPerimeterPerimeter = 22.8;
        assertEquals(expectResultPerimeterPerimeter, rectangle.calculatePerimeter(), Constant.DELTA);
    }
}
