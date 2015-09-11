# Lab #1: Chapter 8
**Due:** September 15th by 6:30 PM

## Question 1: Sentence Capitalizer

Write a method that accepts a String object as an argument and returns a copy of the string with first character of each sentence capitalized. For instance, if the argument is "hello. my name is Joe. what is your name?" the method should return the string, "Hello. My name is Joe. What is your name?" Demonstrate the method in a program (written in the main method of edu.carrollcc.cis232.Question1) that asks the user to input a string and then passes it to the method. The modified string should be displayed on the screen.  Make sure to at least handle periods, question marks, and exclamation marks as sentence endings.

**Points breakdown**

- Technical: 25 points
- Style: 10 points
- Total: 35 points

-----
## Question 2: Check Writer

Write a program (in the main method of edu.carrollcc.cis232.Question2) that displays the amount that should be written on a check. The program should ask the user to enter an amount in decimal format. It should then display the amount in English to be written on a check.

For example, if the user enters `1920.85`, the program should display:

`One thousand nine hundred twenty and 85 cents`

Another example, if the user enters `100000`, the program should display:

`One hundred thousand and no cents`

If the user enters a `0`, a negative number, a non-number, or more than 2 decimal places the program should display:

`Invalid amount`

Do not ask for another amount if it is invalid.

Use [this guide](http://www.eslcafe.com/grammar/saying_large_numbers01.html) for particulars.

The program should work for values up to and including one million.

**Points breakdown**

- Technical: 25 points
- Style: 10 points
- Total: 35 points

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
		4. Repeat the process with Question2Test
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
