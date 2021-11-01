package com.company;

public class Main {

    public static void main(String[] args) {

        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double valueTotal = (myFirstValue + mySecondValue) * 100.00d;
        System.out.println("Total values = " + valueTotal);
        double theRemainder = valueTotal % 40.00d;
        System.out.println("The remainder = " + theRemainder);
        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNoRemainder  = " + isNoRemainder);

        if (!isNoRemainder){
            System.out.println("Got some Remainder");
        }

    }
}
