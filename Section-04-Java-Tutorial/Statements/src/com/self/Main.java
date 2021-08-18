package com.self;

public class Main {

    public static void main(String[] args) {
        // declaration statement
	    int finalScore = 50;
	    int playerLives = 3;
	    int playersHighScore;

	    // expression statement
        // examples: assignment expressions, method calls, object creation expressions
        int calculatedScore = finalScore = 60;

//        playerLives--; // --> postfix
        // postfix reads the variable and then updates it.
        System.out.println("Lives = " + playerLives--); //outputs 3
        System.out.println("Lives = " + playerLives); // outputs 2
//        --playerLives; // --> prefix
        System.out.println("Lives = " + --playerLives); // outputs 1
        // prefix updates the variable and then reads it.


        // control flow statement (e.g. if-then-else; looping: for, while, and do-while; branching: break, continue, and return)
        if (calculatedScore > 59) {
            System.out.println("your score is more than 59");
        }
        
    }
}
