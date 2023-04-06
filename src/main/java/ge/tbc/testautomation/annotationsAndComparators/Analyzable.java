package ge.tbc.testautomation.annotationsAndComparators;


public class Analyzable {

    @VariableNameAnnotation(name = "First")
    private byte first;

    @VariableNameAnnotation(name = "Second")
    private short second;

    @VariableNameAnnotation(name = "Third")
    private boolean third;

    @VariableNameAnnotation(name = "Forth")
    private float forth;

    @VariableNameAnnotation(name = "Fifth")
    private double fifth;

    @VariableNameAnnotation(name = "Sixth")
    private int sixth;

    @VariableNameAnnotation(name = "Seventh")
    private long seventh;

    @VariableNameAnnotation(name = "Eighth")
    private char eighth;

    // როგორც გავარკვიე ესეთ დეითატაიპია ამიტო გავწერე
    // გადავეცით სხვა სახელი
    @VariableNameAnnotation(name = "Object")
    private Object ninth;

    // სხვა ვერაფერი ვერ მოვიფიქრე ამიტო int-ს დავწერ კიდე.
    // არაფერი არ გადავეცით სახელად
    @VariableNameAnnotation(name = "")
    private int tenth;
}
