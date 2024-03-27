package day14;

import java.util.Scanner;

public class FinallyBlock {

	public static void main(String[] args) {
		
		System.out.println("Program is  started..");
		System.out.println("Program is  in progress..");
		
		String s=null;
		
		try
		{
			System.out.println(s.length());
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception occured...handled"); //not handled here as it is a NullPointerException
			
		}
		finally
		{
			System.out.println("Entered in to finally block.......");
		}
		
		System.out.println("Program is  completed..");
		System.out.println("Program is  exited..");

	}

}
