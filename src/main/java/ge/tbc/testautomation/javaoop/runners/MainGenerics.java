package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.generics.AnyPair;
import ge.tbc.testautomation.generics.FigurePair;
import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.figures.Rectangle;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class MainGenerics {

    private static <K, D> AnyPair<Field[], Field[]> getDeclaredFields(K objOne, D objTwo){

        Field[] fieldOne = objOne.getClass().getDeclaredFields();
        Field[] fieldTwo = objTwo.getClass().getDeclaredFields();

        return new AnyPair<>(fieldOne, fieldTwo);
    }

    public static void main(String[] args) {

        //imedia integerebs ase vutitebdt
        AnyPair<Field[], Field[]> pair = getDeclaredFields(4, "tvini mtkiva");

        //meore versia
//        AnyPair<Field[], Field[]> pair = getDeclaredFields(new Integer[1], new String("test"));

        List<Field> first = Arrays.asList(pair.getElementOne());
        List<Field> second = Arrays.asList(pair.getElementTwo());

        //esec ikos
//        for (Field f : first){
//            System.out.println(f.getName());
//        }
//
//        for (Field f : second){
//            System.out.println(f.getName());
//        }


        System.out.println(first);
        System.out.println(second);

        //mokled an me ver gaviazre mexute taski an arvici d imitoro tu unda gadagveca konkretulad int da String mnishvnelobebi
        //gadaveci da ver vprintav axla rac miweria magit da sxva ragacebi iprinteba





        // shemovitanet Circle da Rectangle da movaxdinet matze shesabamisi moqmedeba
        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(7, 8);

        FigurePair<Circle, Rectangle> figurePair = new FigurePair<>(circle, rectangle);

        System.out.println(figurePair);
    }

}
