package com.self;

public class Main {

    public static void main(String[] args) {
	    int score = 4000;

	    if ((score < 5000) && (score > 1000)) {
            System.out.println("Your score was less than 5000 but greater than 1000");
        } else if (score <= 1000) {
            System.out.println("your score was less than or equal to 1000");
        } else {
            System.out.println("got here");
        }
    }
}
