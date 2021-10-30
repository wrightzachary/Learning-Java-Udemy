package com.company;

public class Main {

    public static void main(String[] args) {

        boolean isAlien = false;
        if (isAlien == false) { // can be simplified by using !isAlien
            System.out.println("It is not an alien");
        }

        int topScore = 100;
        if (topScore == 100) {
            System.out.println("You got the high score!");
        }

        if (topScore != 100) {
            System.out.println("Sorry, you do not have the high score!");
        }

        int score = 60;
        if (score > 70) {
            System.out.println("You passed!");
        } else {
            System.out.println("Sorry you did not pass");
        }

        int grade = 85;
        int passingGrade = 70;
        int perfectScore = 100;
        if ((grade >= passingGrade) && (grade ==  perfectScore)) {
            System.out.println("You passed with a perfect score!");
        } else if (grade > passingGrade){
            System.out.println("You passed!");
        } else {
            System.out.println("Sorry you did not pass");
        }

        int passingYards = 671;
        int passingYardsRecord = 550;
        if ((passingYards >= passingYardsRecord) || (passingYards <= passingYardsRecord)) {
            System.out.println("One or more condition is true");
        }

        boolean isCar = false;
        if (isCar == true) {
            System.out.println("Oops");
        } else{
            System.out.println("Is not a car");
        }

        isCar = true;
        boolean wasCar = isCar? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

    }
}
