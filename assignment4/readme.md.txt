Use a class to store grade data

Console
Welcome to the Letter Grade Converter

Enter numerical grade: 90
Letter grade: A

Continue? (y/n): y

Enter numerical grade: 88
Letter grade: A

Continue? (y/n): y

Enter numerical grade: 80
Letter grade: B

Continue? (y/n): y

Enter numerical grade: 67
Letter grade: C

Continue? (y/n): y

Enter numerical grade: 59
Letter grade: F

Continue? (y/n): n

Operation
The user enters a number grade from 0 to 100.
The application displays the corresponding letter grade.
The application prompts the user to continue.

Specifications
This application should use a class named Grade to store the 
data for each grade. This class should include these three methods:
void setNumber(int number)
int getNumber()
String getLetter()

The grading criteria is as follows:
A    88-100
B    80-87
C    67-79
D    60-67
F    <60

Assume that the user will enter valid integers for the grades.
The application should continue only if the user enters “y” or “Y” to continue.
