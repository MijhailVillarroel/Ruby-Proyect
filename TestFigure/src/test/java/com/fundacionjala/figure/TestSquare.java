package com.fundacionjala.figure;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mijhailvillarroel on 6/16/2016.
 */
public class TestSquare {

    private Shape square;

    @Before
    public void setUp() {
        final double side = 5;
        square = new Square(side);
    }

    @Test
    public void testCalculateArea() {
        double expectResultArea = 25;
        assertEquals(expectResultArea, square.calculateArea(), Constant.DELTA);
    }

    @Test
    public void testCalculatePerimeter() {
        double expectResultPerimeter = 20;
        assertEquals(expectResultPerimeter, square.calculatePerimeter(), Constant.DELTA);
    }
}
