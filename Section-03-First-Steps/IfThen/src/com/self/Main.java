package com.self;

public class Main {

    public static void main(String[] args) {

	    boolean isAlien = false;
	    if (isAlien == false) {
			System.out.println("It is not an alien!");
			System.out.println("...I am scared of aliens.");
		}

	    // this can work as a one-line code block without braces. whitespace not necessary. but it does make shit less readable.
	    if (!isAlien)
	        System.out.println("It is still not an alien!");

	    int topScore = 80;
	    if (topScore >= 100) {
			System.out.println("You got the high score!");
		}
	    int secondTopScore = 81;
	    if (topScore > secondTopScore && topScore < 100) {
			System.out.println("Greater than second top score and less than 100");
		}
    }
}
