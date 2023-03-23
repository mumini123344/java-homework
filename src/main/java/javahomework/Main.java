package javahomework;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //როგორც ტასკის  მეოთხე დავალება გავიაზრე, ფუნქციები უნდა გამოვიყენო, რამდენიმეჯერ და და შემდეგ მათი შედეგებით ლისტები შევქმნა
        //ამიტომ გავაკეთებ 3-3 ცვლადს თითო ფუნქციიდან და იმედია ასე უნდა, იმიტორო სხვანაირად ვერ ვიაზრებ:DDD

        System.out.println("Addition Results: ");
        int addNumbers = add(5, 6);
        int addNum = add(3, 4);
        int addXY = add(7, 9);

        System.out.println("Subtraction Results: ");
        int subtractNumbers = subtract(10, 3);
        int subNum = subtract(20, 13);
        int subXY = subtract(15, 5);

        int[] additionResults = {addNumbers, addNum, addXY};
        int[] subtractionResults = {subtractNumbers, subNum, subXY};

            // ორივე ვერსიას დავტოვებ მაინც
//        int[] additionResults = {11, 7, 16};
//        int[] subtractionResults = {13, 33, 20};

        System.out.println("Addition Results: ");
        for (int i = 0; i < 3; i++){
            // System.out.println(additionResults[i]);
            if (additionResults[i] % 2 == 0){
                System.out.println(additionResults[i] + " is even");
            }else{
                System.out.println(additionResults[i] + " is odd");
            }

        }

        System.out.println("Subtract Results: ");
        for (int i = 0; i < 3; i++)
            // System.out.println(subtractionResults[i]);
            if (subtractionResults[i] % 2 == 0) {
                System.out.println(subtractionResults[i] + " is even");
            }else {
                System.out.println(subtractionResults[i] + " is odd");
            }



        System.out.println("Both list together: ");
        int i = 0;
        int j = 0;

            // აქ მარტო ლისტს წერს ერთ ხაზზე, მინდოდა ლუწ-კენტობა ორივე ერთ ლუპში მომექცია მარა არ გამოვიდა ამიტო ცალკ-ცალკე დავწერე
//        while (i < additionResults.length && j < subtractionResults.length){
//            System.out.print(additionResults[i] + " " +  subtractionResults[i] + " ");
//            i++;
//            j++;
//        }


        while (i < additionResults.length){
            if (additionResults[i] % 2 == 0){
                System.out.print(additionResults[i] + " is even, ");
            }else {
                System.out.print(additionResults[i] + " is odd, ");
            }
            i++;
        }

        while (j < subtractionResults.length){
            if (subtractionResults[j] % 2 == 0){
                System.out.print(subtractionResults[j] + " is even, ");
            }else {
                System.out.print(subtractionResults[j] + " is odd, ");
            }
            j++;
        }


    }
    public static int add(int x, int y){
        int c = x + y;
        System.out.println(c);
        return c;
    }

    public static int subtract(int x, int y){
        int c = x + y;
        System.out.println(c);
        return c;
    }
}
