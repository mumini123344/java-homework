package ge.tbc.testautomation.javaoop.runners;


import ge.tbc.testautomation.javaoop.figures.CircleAbstract;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class ContainersAndComparing {
    public static void main(String[] args) {

        System.out.println("--TreeSet Circle--");
        TreeSet<CircleAbstract> circle = new TreeSet<>();
        circle.add(new CircleAbstract(3));
        circle.add(new CircleAbstract(5));
        circle.add(new CircleAbstract(-1));
        circle.add(new CircleAbstract(7));
        circle.add(new CircleAbstract(10));
        circle.add(new CircleAbstract(3));
        circle.add(new CircleAbstract(11));
        circle.add(new CircleAbstract(13));
        circle.add(new CircleAbstract(4));
        circle.add(new CircleAbstract(7));

        System.out.println(circle);

        System.out.println("--HashSet Circle--");
        HashSet<CircleAbstract> circleAbstracts = new HashSet<>();
        circleAbstracts.add(new CircleAbstract(3));
        circleAbstracts.add(new CircleAbstract(1));
        circleAbstracts.add(new CircleAbstract(7));
        circleAbstracts.add(new CircleAbstract(0));
        circleAbstracts.add(new CircleAbstract(2));
        circleAbstracts.add(new CircleAbstract(-3));
        circleAbstracts.add(new CircleAbstract(10));
        circleAbstracts.add(new CircleAbstract(7));
        circleAbstracts.add(new CircleAbstract(11));
        circleAbstracts.add(new CircleAbstract(3));

        System.out.println(circleAbstracts);

        //Crating ArrayList
        ArrayList<String> arr = new ArrayList<>();
        arr.add("555-542-231");
        arr.add("555-887-987");
        arr.add("555-161-143");
        arr.add("555-189-6667");

        //Creating HashMap
        HashMap<String, String> hashmap = new HashMap<>();

        hashmap.put("Irinka", "555-542-231");
        hashmap.put("Tiko", "555-887-987");
        hashmap.put("Giorgi", "555-161-143");
        hashmap.put("Agent 007 Cotne", "555-189-6667");

        System.out.println("--People who has '8' in their number--");
        hashmap.entrySet().forEach(entry -> {
            if (entry.getValue().contains("8")) {
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        });

        System.out.println("--Using For loop--");
        for (String number : arr){
            System.out.println(number);
        }

        System.out.println("--Using While Loop--");
        int index = 0;
        while (index < arr.size()){
            System.out.println(arr.get(index));
            index++;

        }
    }
}
