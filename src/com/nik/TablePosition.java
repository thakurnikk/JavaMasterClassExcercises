package com.nik;

public class TablePosition {

    public static void main(String[] args) {

        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Nikhil", position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("Adam", position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("Sergei", position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("Tim", position);
    }

    //Method to display High Score Position and name
    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get into position " + position + " on the high score table");
    }

    //Method to calculate High Score Position according to your score
    public static int calculateHighScorePosition(int score){

        /*One Way
        if(score >= 1000)
            return 1;
        else if (score >= 500)
            return 2;
        else if (score >= 100)
            return 3;

        return 4;
        */

        //Other way
        return (score >= 1000) ? 1 : ((score >= 500) ? 2 : ((score >=100) ? 3 : 4));
    }
}



