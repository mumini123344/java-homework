package ge.tbc.testautomation.javaoop.figures;

import ge.tbc.testautomation.exceptionsStringOperationsRegex.RadiusException;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.LimitException;

public class CircleTwo extends FigureTwo {
    private double radius;


    public CircleTwo(double radius) {
        if (FigureTwo.numberOfInstances >= 5) {
            throw new LimitException("INSTANTIATION LIMIT REACHED");
        }
        if (radius < 0) {
            throw new RadiusException("RADIUS VALUE NOT VALID");
        }
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

}
