package com.company;

public class Main {

    public static void main(String[] args) {

        calculateScore(true, 800, 5, 100);

        calculateScore(true, 10000, 8, 200);

        int highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Zach", highScorePosition);

        highScorePosition= calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition= calculateHighScorePosition(400);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition= calculateHighScorePosition(90);
        displayHighScorePosition("Jane", highScorePosition);


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        } else {
            return -1;
        }

    }

    public static void displayHighScorePosition(String playersName, int highScorePosition) {
        System.out.println(playersName + " managed to get into position "
                + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {

//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100){
//            return 3;
//        } else {
//            return 4;
//        }
        int position = 4;
        if (playerScore >= 1000) {
            position =1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }

        return position;
    }
}
