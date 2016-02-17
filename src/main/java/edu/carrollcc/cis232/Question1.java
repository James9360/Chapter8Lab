package edu.carrollcc.cis232;

import java.util.Scanner;

public class Question1 
{
	/**
	 * Gets input from the user and capitalizes the first word of each sentence.
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner (System.in); //Gets user input
		System.out.print("Enter a string: "); //Prompts the user for input.
		String tempString = keyboard.nextLine();
		
		StringBuilder input = new StringBuilder(tempString.length()); //This will make a StringBuilder		
		boolean isFirstCapital = true; //This will decide if the first letter of each sentence will be capitalized.	
		
		/*
		* This loop will go through the entire string the user entered. 
		* 
		* It will look for letters that come after a ('.' or '?' or '!') and
		* capitalize the fist letter of each sentence.
		* 
		* After said character is capitalized, it will change to false until the beginning of 
		* the next sentence.
		*/
		for (int i=0; i<tempString.length(); i++)
		{
			char tempChar = tempString.charAt(i);
			
			// This checks if the current index is one of these characters. Makes isFirstCapital true.
			if (tempChar == '.' || tempChar == '!' || tempChar == '?')
			{
				isFirstCapital = true;
			}
			
			// This will make the first letter of a sentence capital. Reassigns isFirstCapital to false.
			else if (isFirstCapital && Character.isAlphabetic(tempChar))
			{
				tempChar = Character.toUpperCase(tempChar);
				isFirstCapital = false;
			}
			
			input.append(tempChar); //Appends the character to the StringBuilder.
			
		}
		System.out.println(input);
		keyboard.close(); // Closes the Scanner object.
	}
}