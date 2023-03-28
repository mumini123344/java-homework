package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.exceptionsStringOperationsRegex.LimitException;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.RadiusException;
import ge.tbc.testautomation.javaoop.figures.CircleTwo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainTwo {
    public static void main(String[] args) {
        try {
            CircleTwo circle = new CircleTwo(-1.0d);
            CircleTwo circle1 = new CircleTwo(3.0d);
            CircleTwo circle2 = new CircleTwo(-4.0d);
            CircleTwo circle3 = new CircleTwo(6.0d);
            CircleTwo circle4 = new CircleTwo(9.0d);
            CircleTwo circle5 = new CircleTwo(10.0d);
        } catch (RadiusException e) {
            System.out.println("Message: " + e.getMessage());
        } catch (LimitException e) {
            System.out.println("Message: " + e.getMessage());
        }

        String s = "Test Automation Bootcamp 6, 2022";
        // vigebt Automation-s da to lower case
        String automation = s.substring(5,15).toLowerCase();
        System.out.println(automation);
        // winadadebis sigrdze
        System.out.println(s.length());
        // depisis chamateba
        System.out.println(s.replaceAll(" ", "-"));
        // masivad gadaqceva da calk-calk xazze daprintva
        String[] str = s.split(" ");
        for (String word : str) {
            System.out.println(word);
        }


        String[] phoneNumbers = {"555-123-345", "595-233-552", "592-455-765", "599-012-133"};
        for (String phoneNumber : phoneNumbers){
            boolean number = phoneNumberValidation(phoneNumber);
            // აქ გამოვიდა დეფისების ამოღება, მაგრამ თვითონ რეგექსში რაც ვცადე არა, მაგრამ ორივეს დავტოვებ და იქნებ მერე პრაივატ
            // კომენტარში მითხრათ როგორ უნდა გამეკეთებინა რეგექსში
            // რეგექსიშიც რომაქვს დაახლოებით მსგავსი ფუნქცია ორჯერ იპრინტება ნომრები მაგის გამო.
            System.out.println(phoneNumber.replaceAll("-", " ") + " " + number);


        }

    }
    private static boolean phoneNumberValidation(String phoneNumber) {
        String phoneNumberPattern = "^(555|595|592|599){6}[0-9]$";
        Pattern pattern = Pattern.compile(phoneNumberPattern);
        Matcher matcher = pattern.matcher(phoneNumberPattern.replaceAll("-", ""));

        if (matcher.matches()) {
            System.out.println(phoneNumber +  " Valid phone number");
        }else {
            System.out.println(phoneNumber + " Invalid phone number");
        }
        return phoneNumber.matches(phoneNumberPattern);


    }

}
