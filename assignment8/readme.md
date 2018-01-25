Work with customer and employee data 

Console
Welcome to the Person Tester application

Create customer or employee? (c/e): c

Enter first name: Dave
Enter last name: Gahan
Enter email address: dave12@gmail.com
Customer number: M10293

You entered:
Name: Dave Gahan
Email: dave12@gmail.com
Customer number: M10293

Continue? (y/n): y

Create customer or employee? (c/e): e

Enter first name: Martin	
Enter last name: Gore
Enter email address: martin34@gmail.com
Social security number: 111-11-1111

You entered:
Name: Martin Gore
Email: martin34@gmail.com
Social security number: 111-11-1111

Continue? (y/n): n

Operation
The application prompts the user to enter a customer or an employee.
If the user selects customer, the application asks for name, 
email, and customer number.
If the user selects employee, the application asks for name, 
email, and social security number.
When the user finishes entering data for a customer or employee, 
the application displays the data that the user entered.

Specifications
Create an abstract Person class that stores first name, 
last name, and email address. This class should provide a no-argument 
constructor, get and set methods for each instance variable, and it 
should override the toString method so it returns the first name, 
last name, and email fields in this format:

Name: Dave Gahan
Email: dave12@gmail.com

In addition, it should contain an abstract method named 
getDisplayText that returns a string.
Create a class named Customer that inherits the Person class. 
This class should store a customer number, it should provide get and 
set methods for the customer number, it should provide a no-argument 
constructor, and it should provide an implementation of the getDisplayText 
method. The getDisplayText method should return a string that consists of 
the string returned by the toString method of the Person class appended 
with the Customer number like this:

You entered:
Name: Dave Gahan
Email: dave12@gmail.com
Customer number: M10293

Create a class named Employee that inherits the Person class. 
This class should store a social security number, it should provide get 
and set methods for the social security number, it should provide a 
no-argument constructor, and it should provide an implementation of 
the getDisplayText method. The getDisplayText method should return a 
string that consists of the string returned by the toString method of 
the Person class appended with the Employees social security number like this:

Name: Martin Gore
Email: martin34@gmail.com
Social security number: 111-11-1111

Create a class named PersonApp that prompts the user as shown in the console 
output. This class should create the necessary Customer and Employee 
objects from the data entered by the user, and it should use these objects 
to display the data to the user. To print the data for an object to the console, 
this application should use a static method named print that accepts a Person object.
Use the Console class from chapter 8 or a variation of it to get entries from the user.
