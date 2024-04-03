package programPractice100;

//Define a  exception class
class MyCustomException extends Exception {
 public MyCustomException(String message) {
     super(message);
 }
}

//Main class
public class Sample {
 // Method that throws the custom exception
 public static void validate(int age) throws MyCustomException {
     // Check if age is less than 18
     if (age < 18) {
         // If less than 18, throw the custom exception with a message
         throw new MyCustomException("You must be at least 18 years old.");
     } else {
         // If age is valid, print a message
         System.out.println("You are eligible!");
     }
 }

 // Main method
 public static void main(String[] args) {
     try {
         // Call the validate method with an age
         validate(15);
     } catch (MyCustomException e) {
         // Catch the custom exception and print the message
         System.out.println("Caught Custom Exception: " + e.getMessage());
     }
 }
}

