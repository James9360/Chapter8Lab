package edu.carrollcc.cis232;

public class Question3 
{
	/**
	 * Sends in mock data to reverse, replace, char array to string, frequent character, and word count.
	 * 
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//This is all hard coated data to test the methods.
		char[] temp = {'t', 'h', 'i', 's', ' ', 'a', ' ', 's', 't', 'r', 'i', 'n', 'g'};
		System.out.println("The most frequent character in 'This is a String' is: " + mostFrequent("This is a string!"));
		System.out.println ("\nThe number of words in 'This has approximately five words' is: " + wordCount ("This has approximately five words."));
		System.out.println("\nCharacter array to String: " + arrayToString(temp));
		System.out.println ("\nHello World! reversed: " + reverse ("Hello World!"));
	}
	
	/**
	 * This will accept a String object and return it reversed
	 * 
	 * @param temp Accepts a String to be reversed
	 * @return Returns a reversed string
	 */
	public static String reverse (String temp)
	{
		StringBuilder sBuild = new StringBuilder();
		if (temp == null || temp.equals("")) //If passed data is null or empty, return nulls
		{
			return null;
		}
		//Starts at the end of the string and adds each character to the StringBuilder
		for (int i = temp.length()-1; i >= 0; i--)
		{
			sBuild.append(temp.charAt(i));
		}
		return sBuild.toString();
	}
	
	/**
	 * This will search all occurrences of string2 in string1 and if it comes across one, it
	 * replaces it with string3
	 * 
	 * @param string1 The String that you want to change
	 * @param string2 The word you want to change
	 * @param string3 The new word you want to replace string2
	 * @return Returns a new String with the new word.
	 */
	public static String replaceSubstring (String string1, String string2, String string3)
	{
		//If either string is null, return the first string
		if (string1 == null || string2 == null || string3 == null)
		{
			return string1;
		}
		
	    StringBuilder sBuilder = new StringBuilder();
	    int i; //Initializes a iterator
	    int prev = 0; //Previous index
	    while((i = string1.indexOf(string2, prev)) >= 0 )
	    {
	    	sBuilder.append( string1.substring(prev, i) ).append( string3 );
	        prev = i + string2.length();
	    }
	    sBuilder.append(string1.substring(prev));
	    return sBuilder.toString();
	}
	
	/**
	 * This will go through a string and return the most frequent character
	 * 
	 * @param word Accepts a String
	 * @return Returns the most frequent letter in the word, returns null if null or a empty string is passed in.
	 */
	public static Character mostFrequent(String word)
    {
		//If the passed in data is empty or null, it will return null
        if (word == null || word.equals(""))
        {
        	return null;
        }		
		
        int numCharacters = 0; //The number of characters in the string, resets after each iteration 
        int maxCharacter = 0; //The number of max characters, will override if a character has more occurrences 
        char maxCharacterChar = ' '; //This will store the character that appears the most

        //This outer loop will check each individual character and loop through and count each occurrence
        for(int i =0; i < word.length(); i++)
        {
            char tempChar = word.charAt(i); //This assigns a the indexed character to a temporary character
            numCharacters = 0; //This resets the number of characters that appears.
            //The inner loop will count the number of each character
            for(int j = 0; j < word.length(); j++)
            {
                if(tempChar == word.charAt(j))
                {
                    numCharacters++; //Adds 1 to the counter for each occurrence
                    
                    //If the current number of occurrences is greater than the max, reassign the max
                    if(numCharacters > maxCharacter) 
                    {
                        maxCharacter = numCharacters;
                        maxCharacterChar = word.charAt(i);
                    }
                }
            }
        }
        return Character.toUpperCase(maxCharacterChar);
    }
	
	/**
	 * 
	 * @param tempArray Accepts a character array
	 * @return Returns the array into a string.
	 */
	public static String arrayToString(char[] tempArray)
	{
		StringBuffer sBuffer = new StringBuffer();
		if (tempArray == null) //If passed data is null, return a empty string
		{
			return "";
		}
		else
		{
			//Goes through the array and appends each character to the StringBuffer
			for (int i = 0; i < tempArray.length; i++)
			{
				sBuffer.append(tempArray[i]);
			}
			return sBuffer.toString();
		}
	}
	
	/**
	 * This will count the number of words in a string.
	 * 
	 * @param temp Accepts a String
	 * @return Returns the number of words.
	 */
	public static int wordCount (String temp)
	{
		//Initialize variables
		int wordCount = 0;
		boolean space = true;
		
		if (temp == null) //If passed data is null, return 0.
		{
			return 0;
		}
		//This will go through the string and count the words
		for (int i = 0; i < temp.length(); i++)
		{
			if (temp.charAt(i) == ' ')//If there is a space, there must be another word.
			{
				space=true;
		    }
			else
			{
				if(space) //If there is a space, then add 1 to the word counter, reassign space to false
				{
					wordCount++;
					space = false;
				}

		    }
		}
		return wordCount;
	}
}