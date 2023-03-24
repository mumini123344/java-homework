package ge.tbc.testautomation.javaoop.util;

import ge.tbc.testautomation.javaoop.figures.Rectangle;

public class HelperFunctions {

    public static void compareRectangles(Rectangle rectangle1, Rectangle rectangle2) {

        double parameter1 = rectangle1.getPerimeter();
        double parameter2 = rectangle2.getPerimeter();

        if (parameter1 > parameter2) {
            System.out.println("parameter 1 > parameter 2");
        }else {
            System.out.println("parameter 1 < parameter 2");
        }
    }
}
