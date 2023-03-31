package ge.tbc.testautomation.javaoop.runners;


import ge.tbc.testautomation.abstractClassesInterfaces.IResizableCircle;
import ge.tbc.testautomation.javaoop.figures.CircleAbstract;

public class MainAbstract {
    public static void main(String[] args) {
        CircleAbstract circleAbstract = new CircleAbstract(4);

        // ზოგადი მონაცემები
        System.out.println("Circle Area: " + circleAbstract.getArea());
        System.out.println("Circle Length: " + circleAbstract.getLength());
        System.out.println("Circle Radius: " + circleAbstract.getRadius());
        System.out.print("Circle Package Address: ");
        circleAbstract.printPackageName();

        // validate
        boolean validate = circleAbstract.validateCircle(circleAbstract);
        System.out.println("True or False?: " + validate);

        // ნეგატიური მნიშვნელობის დაშვება
        CircleAbstract negativeRadius = new CircleAbstract(-1);
        boolean validate2 = negativeRadius.validateCircle(negativeRadius);
        System.out.println("True or False?: " + validate2);
        System.out.println();

        // ბევრი წვალების შემდეგ შევქმენი resizableCircle ობიექტი, რომლის მნიშვნელობაც უდრის circleAbstract-ს
        // შემდეგ ამ ორის ინსტანცირება მოვახდინე და წესით ასე უნდა გვექნა
        IResizableCircle resizableCircle = circleAbstract;
        CircleAbstract doubleSized = resizableCircle.returnDoubleSizedCircle(circleAbstract);
        CircleAbstract customSized = resizableCircle.returnCustomSizedCircle(circleAbstract, 3);

        // ვინაიდან არვარ დარწმუნებული მარტო რადიუსზე უნდა გამოგვეყენებინა თუარა ამიტო დავწერ Length-საც და Area-საც
        System.out.println("--Double Sized Circle--");
        System.out.println("Double sized Circle Radius: " + doubleSized.getRadius());
        System.out.println("Double sized Circle Area: " + doubleSized.getArea());
        System.out.println("Double sized Circle Length: " + doubleSized.getLength());
        System.out.println("--Custom sized Circle--");
        System.out.println("Custom sized Circle Radius: " + customSized.getRadius());
        System.out.println("Custom sized Circle Area: " + customSized.getArea());
        System.out.println("Custom sized Circle Length: " + customSized.getLength());






    }
}
