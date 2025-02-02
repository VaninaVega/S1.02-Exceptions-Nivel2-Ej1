# S1.02-Exceptions-Nivel2-Ej1


## Summary: exercise description

Create a class called "Input". This class should be used to control the different exceptions that can appear in Java when entering data by keyboard using the Scanner class.

The first thing to do is instantiate an object of the Scanner class and from there, create static methods to read the different types of data from the keyboard.

Important

It is important that if an exception occurs in any method, we handle it and ask the user for the data again until it is entered correctly. For example: If they enter a float with a dot instead of a comma, it should display "Format error". Until the user enters a well-formed float, they should continue asking for the data.

All methods receive a String with the message that they want to show the user, for example: "Enter your age", and return the appropriate data entered by the user in each method, for example: a byte with the user's age.

Methods to implement catching the exception of the "InputMismatchException" class:

public static byte readByte(String message);

public static int readInt(String message);

public static float readFloat(String message);

public static double readDouble(String message);

Methods to implement catching a custom exception of the Exception class:

public static char readChar(String message);

public static String readString(String message);

public static boolean readSiNo(String message), if the user enters “s”, returns “true”, if the user enters “n”, returns “false”.

## Technologies Used

java 22

## Requirements

Programming language: Java 22

Development environment: IntelliJ IDEA

## How to run it

Clone the repository or download the zip file and run it in your favorite IDE.

## Contribution

Contributions are welcome! Please follow these steps to contribute:

-Fork the repository
-Create a new branch git checkout
-b feature/NewFeature
-Make your changes and commit them: git commit
-m 'Add New Feature'
-Upload the changes to your branch: git push origin feature/NewFeature
-Make a pull request