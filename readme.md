# Lab #1: Chapter 8
**Due:** February 15th by 6:30 PM

## Question 1: Sentence Capitalizer

Write a method that accepts a String object as an argument and returns a copy of the string with first character of each sentence capitalized. For instance, if the argument is "hello. my name is Joe. what is your name?" the method should return the string, "Hello. My name is Joe. What is your name?" Demonstrate the method in a program (written in the main method of edu.carrollcc.cis232.Question1) that asks the user to input a string and then passes it to the method. The modified string should be displayed on the screen.  Make sure to at least handle periods, question marks, and exclamation marks as sentence endings.

**Points breakdown**

- Technical: 15 points
- Style: 5 points
- Total: 20 points

-----
## Question 2: Average of Numbers in a String

Write a program (in the main method of edu.carrollcc.cis232.Question1) that asks the user to enter a series of numbers separated by commas. 

Here is an example of valid input:
`7,9,10,2,18,6.5`

The program should calculate and display the average of all the numbers out to exactly 3 decimal places.

If the input is invalid, display "invalid input" instead of showing an average value.

**Points breakdown**

- Technical: 15 points
- Style: 5 points
- Total: 20 points

-----
## Question 3: Miscellaneous String Operations

Add the following methods to the edu.carrollcc.cis232.Question2 class:

**wordCount** This method should accept a `String` object as an argument and return the number of words contained in the object.  If `null` is passed in, return 0.

**arrayToString** This method accepts a `char` array as an argument and converts it to a `String` object. The method should return a reference to the `String` object. If `null` is passed in, return an empty `String`.

**mostFrequent** This method accepts a `String` object as an argument and returns the `Character` that occurs most frequently in the object.  If `null` is passed in, return `null`.  Return the character in uppercase, ignore case when computing which is the most frequently occuring character.

**replaceSubstring** This method accepts three `String` objects as arguments. Let's call them `string1`, `string2`, and `string3`. It searches `string1` for all occurrences of `string2`. When it finds an occurrence of `string2`, it replaces it with `string3`. For example, suppose the three arguments have the following values:

	string1: "the dog jumped over the fence"
	string2: "the"
	string3: "that"
	
With these three arguments, the method would return a `String` object with the value "that dog jumped over that fence".

If `null` is passed in for any of the arguments, return `string1`.
	
**reverse** This method accepts a `String` object as an argument and returns a String with the letters reversed. If `null` is passed in, return `null`.

Demonstrate each of these methods in a complete program in the Question2 main method.

**Points breakdown**

- Technical: 25 points
- Style: 5 points
- Total: 30 points

----
### How to submit the lab
This section outlines how to get the lab on to your computer and how to submit it.

1. Fork the Chapter 8 lab repository
2. Import the project into Eclipse
	1. Click File->Import...
	2. Choose Git->Projects from Git
	3. Choose "Clone URI", press Next
	4. Copy the clone URI on your forked github repository (bottom right)
	5. Paste the URI into the Eclipse window
	6. Set your GitHub user name and password, leave everything else as it is.
	7. Press Next
	8. Choose Master on the "Branch Selection" screen and press Next
	9. Choose a local destination directory and press Next
	10. Select "Import existing Eclipse project" (should be default choice), press Next.
	11. Press Finish and your project is imported!
	12. Right click the project in the package explorer, click Maven->Update Project... (Or press Alt+F5)
3. Do the actual lab work
	1. Read/implement the Question1 and Question2 sections above
5. Test your work.
	1. Run the application by pressing the Play button to test your program manually.
	2. To test your program with the built-in Unit tests: 
		1. Open the unit test class named Question1Test in the src/test/java folder.
		2. Press the Play button.
		3. The failed tests will show up as red on the left. Passed tests will show up as green.
		4. Repeat the process with other Questions
6. Submit your work
	1. Right click the project
	2. Choose Team->Commit...
	3. Enter a comment such as "My solution for the chapter 8 lab"
	4. Enter your name/email for the author/committer fields if it is not set
	5. Press "Commit and Push". (Committing saves the changes locally, Pushing saves the changes on your GitHub fork)
	6. Your work is now on your GitHub fork.  Open up the browser to your GitHub fork of the example lab.
	7. Press the green pull request button at the top to the left of the "Branch: master" dropdown.
	8. To finally submit your lab, Click the green "Create new pull request" button, enter a title and message, and press "Create pull request".
	9. Your lab is now submitted!
