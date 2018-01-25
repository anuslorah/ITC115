Create a  number guessing game that allows you to guess the value of a random number. 
Each time you make a guess, the game tells you whether your guess is too high or too low. 
This process repeats until you guess the correct number. 
A sample run of the application should look like this:

Welcome to the Number Guessing Game

Enter the upper limit for the number: 50
OK, I'm thinking of a number between 0 and 50

Enter your guess: 25
Your guess is too high.

Enter your guess: 20
Your guess is too low.

Enter your guess: 23
Correct!

Bye!

Hints: 
Use of the Random class (not Math.random()) to generate a random integer between 0 and upperLimit.  
Here is the code you should use in your program: 
Random random = new Random();
int number = random.nextInt(upperLimit - 1) + 1;

Write the while loop that allows the user to guess again if their guess was wrong. 
This loop should inform the user whether their guess was too high or too low. 
Then, it should prompt the user for a new guess. The loop should exit when the user’s guess 
is equal to the random number the computer generated.
After the while loop, write code that tells the user they guessed correctly.
