package edu.carrollcc.cis232;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Question2 
{
	/**
	 * This will ask the user for a string of numbers separated by commas
	 * Incorrect input will close the program
	 * 
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Enter a string of numbers separated by commas: ");
		String input = keyboard.nextLine();
		keyboard.close();
		
		System.out.printf("%.3f\n", average(input)); //Prints out the output to 3 decimal places
	}
	
	/**
	 * This will compute the average of numbers in a string. If the
	 * String isn't formated correctly,input will be invalid and it 
	 * will end the program.
	 * 
	 * @param input Accepts a string of numbers separated by commas ','
	 * @return Returns a average(double)
	 */
	public static double average (String input)
	{
		StringTokenizer token = new StringTokenizer(input, ",", false);
		
		//Initialize variables
		double average = 0, total = 0;
		int count = 0;
		boolean invalid = false;
		
		//If the string contains more tokens, there is more numbers to compute
		while (token.hasMoreTokens())
		{ 
			//This try catch will check if the inputed string is in the correct format
			try 
			{
				total += Double.parseDouble(token.nextToken().trim());
				count++;				
			}
			catch (NumberFormatException NFE)
			{
				System.out.println("Invalid input!");
				invalid = true;
				System.exit(0); //This will kill the program if there is invalid input.
			}
		}
		//If the input is not invalid, calculate average
		if (!invalid)
		{
			average = (total/count);
		}
		
		return average;
	}
}
