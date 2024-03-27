package day14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandleExceptions {

	public static void main(String[] args) {
		
		System.out.println("Program is  started..");
		System.out.println("Program is  in progress..");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");

		try {
			int num = sc.nextInt(); // Attempt to read an integer
			System.out.println(100 / num); // Perform division
		} catch (InputMismatchException e) {
			// If the input is not an integer, handle the exception here
			System.out.println("Only numbers format is allowed");
		} catch (ArithmeticException e) {
			// If the input is 0 causing division by zero, handle the exception here
			System.out.println("Division by zero is not allowed");
		}
		
		System.out.println("Program is  completed..");
		System.out.println("Program is  exited..");

	}

}
