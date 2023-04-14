package Internship;

import java.util.Scanner;

public class NumberGuessingGame {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int secretNumber = (int) (Math.random() * 100) + 1; // generates a random number between 1 and 100
	        int attempts = 0;
	        int guess = 0;
	        boolean isGuessed = false;

	        System.out.println("Welcome to the Number Guessing Game!");
	        System.out.println("Guess a number between 1 and 100.");

	        while (!isGuessed) {
	            System.out.print("Enter your guess: ");
	            guess = scanner.nextInt();
	            attempts++;

	            if (guess == secretNumber) {
	                isGuessed = true;
	                System.out.println("Congratulations! You guessed the correct number " + secretNumber + " in " + attempts + " attempts.");
	            } else if (guess < secretNumber) {
	                System.out.println("Nope! The secret number is higher.");
	            } else {
	                System.out.println("Nope! The secret number is lower.");
	            }
	        }

	        scanner.close();
	    }
	}
