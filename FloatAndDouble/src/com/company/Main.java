package com.company;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float MIN Value = " + myMinFloatValue);
        System.out.println("Float MAX Value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double MIN Value = " + myMinDoubleValue);
        System.out.println("Double MAX Value = " + myMaxDoubleValue);

        int myIntValue = 5 / 2;
        float myFloatValue = 5f / 2;
        double myDoubleValue = 5.00 /3.00;

        System.out.println("MyIntValue= " + myIntValue);
        System.out.println("MyFloatValue= " + myFloatValue);
        System.out.println("MyDoubleValue= " + myDoubleValue);

        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted kilograms= " + convertedKilograms);

        double pi =  3.1415927d;
        double anotherNUmber  =  3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(convertedKilograms);
        System.out.println(anotherNUmber);
    }
}
