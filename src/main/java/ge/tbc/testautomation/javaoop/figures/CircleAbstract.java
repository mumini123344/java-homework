package ge.tbc.testautomation.javaoop.figures;

import ge.tbc.testautomation.abstractClassesInterfaces.IResizableCircle;
import ge.tbc.testautomation.abstractClassesInterfaces.IValidCircle;

public class CircleAbstract extends FigureAbstract implements IResizableCircle, IValidCircle {

    private double radius;

    public CircleAbstract(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getLength() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void printPackageName() {
        System.out.println(getClass().getPackage().getName());
    }

    @Override
    public CircleAbstract returnDoubleSizedCircle(CircleAbstract circleAbstract) {
        return new CircleAbstract(circleAbstract.radius * 2);
    }

    @Override
    public CircleAbstract returnCustomSizedCircle(CircleAbstract circleAbstract, double byvValue) {
        return new CircleAbstract(circleAbstract.radius * byvValue);

    }

    @Override
    public boolean validateCircle(CircleAbstract circleAbstract) {
        return circleAbstract.radius > 0;
        }
}

