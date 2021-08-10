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

	    int topScore = 100;
	    if (topScore >= 100) {
			System.out.println("You got the high score!");
		}
	    int secondTopScore = 95;
	    if ((topScore > secondTopScore) && (topScore < 100)) {
			System.out.println("Greater than second top score and less than 100");
		}

	    if ((topScore > 90) || (secondTopScore <= 90)) {
			System.out.println("Either or both of the conditions are true.");
		}

	    int newValue = 50;
	    if (newValue == 50) {
			System.out.println("this is true");
		}

	    boolean isCar = false;
	    if (isCar) {
			System.out.println("this isn't supposed to happen");
		}

	    boolean wasCar = isCar ? true : false;
	    if (wasCar) {
			System.out.println("it was a car");
		} else {
			System.out.println("i guess it wasn't a car");
		}

	    //challenge:
		double firstValue = 20.00;
	    double secondValue = 80.00;
	    double result = (firstValue + secondValue) * 100;
	    double remainder = result % 40.00;
	    boolean isRemainderZero = (remainder == 0);
		System.out.println(isRemainderZero);
		if (!isRemainderZero) {
			System.out.println("we got a remainder and it is " + remainder);
		}
    }
}
