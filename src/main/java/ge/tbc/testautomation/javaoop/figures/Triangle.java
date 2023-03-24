package ge.tbc.testautomation.javaoop.figures;

public class Triangle extends Figure {
    private double a;
    private double b; //b იქნება ფუძე ამ სამკუთხედისთვის
    private double c;
    private double h = 3; // ფუძეზე დაშვებული სიმაღლე


    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double getArea() {
        return (b * h) / 2; //მგონი ესაა სამკუთხედის ფართბის ფორმულას დ თუ b ცვლადს ფუძედ ჩავთვლით
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }
}