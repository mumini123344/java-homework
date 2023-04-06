package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.annotationsAndComparators.Analyzable;
import ge.tbc.testautomation.annotationsAndComparators.Rectangle;
import ge.tbc.testautomation.annotationsAndComparators.RectangleComparator;
import ge.tbc.testautomation.annotationsAndComparators.VariableNameAnnotation;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("unused")
public class MainAnnotations {
    public static void main(String[] args) {
        String gamoukenebeli = "gamoukenebels";
        int gamoukenebeliTwo = 1;


        Analyzable analyzable = new Analyzable();
        Class<?> unknownType = analyzable.getClass();
        Field[] fields = unknownType.getDeclaredFields();

        for (Field field : fields){
            if (field.isAnnotationPresent(VariableNameAnnotation.class)){
                VariableNameAnnotation annotation = field.getAnnotation(VariableNameAnnotation.class);
                String name = annotation.name();
                String fieldName = field.getName();
                boolean isMatch = fieldName.equalsIgnoreCase(name);

                if (!isMatch){
                    System.out.println("VARIABLE NAME MISMATCH FOUND.");
                }

                System.out.println("Field Name: " + fieldName + "; Annotation Name: " + name + "; isMatch: " + isMatch);
            }
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        // for loop მეთოდით, ნუ მართალია 0-9მდე პრინტავს მარა მაინც დ
//        for (int i = 0; i < 10; i++){
//            arrayList.add(i);
//            Collections.sort(arrayList);
//        }
//        System.out.println(arrayList);

        // ჩვეულებრივი მეთოდით
        System.out.println("--Increasing Sorting--");
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(23);
        arrayList.add(19);
        arrayList.add(7);
        arrayList.add(11);
        arrayList.add(31);
        arrayList.add(8);
        arrayList.add(1);
        Collections.sort(arrayList);
        System.out.println("Dasortirebuli listi: " + arrayList);

        List<Rectangle> rectangles = new ArrayList<>();

        rectangles.add(new Rectangle(1, 4));
        rectangles.add(new Rectangle(3, 5));
        rectangles.add(new Rectangle(4, 10));
        rectangles.add(new Rectangle(2, 11));
        rectangles.add(new Rectangle(3, 7));
        rectangles.add(new Rectangle(2, 9));
        rectangles.add(new Rectangle(8, 5));
        rectangles.add(new Rectangle(7, 7));
        rectangles.add(new Rectangle(13, 4));

        System.out.println("--Decreasing Sorting--");
        Collections.sort(rectangles, new RectangleComparator());

        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }
    }
}
