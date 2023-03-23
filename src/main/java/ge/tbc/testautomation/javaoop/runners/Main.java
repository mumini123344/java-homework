package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.util.Util;

import java.util.Random;


public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        System.out.println("--Number of instances--");
        Circle c1 = new Circle(3.0d);
        System.out.println(Circle.getNumberOfCircleInstances());

        Circle c2 = new Circle(4.0d);
        System.out.println(Circle.getNumberOfCircleInstances());

        Circle c3 = new Circle(5.0d);
        System.out.println(Circle.getNumberOfCircleInstances());

        Circle c4 = new Circle(6.0d);
        System.out.println(Circle.getNumberOfCircleInstances());

        Circle c5 = new Circle(7.0d);
        System.out.println(Circle.getNumberOfCircleInstances());

        // პირდაპირი მეთოდი
//        System.out.println(Util.circleToString(c1));
//        System.out.println(Util.circleToString(c2));
//        System.out.println(Util.circleToString(c3));
//        System.out.println(Util.circleToString(c4));
//        System.out.println(Util.circleToString(c5));

        // ცვლადით
        System.out.println("--Radius's--");
        String circle1 = Util.circleToString(c1);
        System.out.println(circle1);

        String circle2 = Util.circleToString(c2);
        System.out.println(circle2);

        String circle3 = Util.circleToString(c3);
        System.out.println(circle3);

        String circle4 = Util.circleToString(c4);
        System.out.println(circle4);

        String circle5 = Util.circleToString(c5);
        System.out.println(circle5);


        //Bonus
        System.out.println("--Bonus--");
        Circle a1 = new Circle(random.nextDouble(100.0d));
        System.out.println(Util.circleToString(a1));

        Circle a2 = new Circle(random.nextDouble(100.0d));
        System.out.println(Util.circleToString(a2));

        Circle a3 = new Circle(random.nextDouble(100.0d));
        System.out.println(Util.circleToString(a3));

        Circle a4 = new Circle(random.nextDouble(100.0d));
        System.out.println(Util.circleToString(a4));

        Circle a5 = new Circle(random.nextDouble(100.0d));
        System.out.println(Util.circleToString(a5));



    }
}
