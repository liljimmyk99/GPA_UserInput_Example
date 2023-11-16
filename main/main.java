package main;

import java.util.Scanner;

/**
 * main
 */
public class main {

  static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {

      // Variable Declaration
      String firstName;
      String lastName;
      int numCourses;
      Double[] courses;

      // Variable Initalization
      firstName = getStringwithPrompt("What is your first name?");
      lastName = getStringwithPrompt("What is your last name?");
      numCourses = getIntwithPrompt("Hello there " + firstName + " " + lastName + ", how many classes are you taking right now?");
      courses =  getClassGPAs(numCourses);

      // Close the scanner as it is not needed anymore
      input.close();

      // Finalized GPA Calculation
      Double semesterGPA = getGPA(courses);
      System.out.println("You have a Grade Point Average of: " + semesterGPA);

  }

  // getGPA takes in an array of doubles & returns an average of the elements int the array
  public static Double getGPA(Double[] courses){
    Double total = 0.0;
    for (Double course: courses){
      // This is the same as saying total = total + course
        total += course;
    }
    return (total / courses.length);
  }

  // getClassGPAs takes in the number of courses and returns an initalized double array of that size
  public static Double[] getClassGPAs(int numCourses) {
      Double[] courses =  new Double[numCourses];
      for (int i = 0; i < numCourses; i++) {
        // We need to continually run the following code until we get valid input
        // As a result we create a boolean to reflect the status of valid input
        // We want this boolean to reset every cycle through the loop so we will define and initalize this inside the for loop
        // If we didn't once the value is flipped the first time through the loop, it won't be reset
        boolean validGradeInput = false;

        // You can write this differently if your variable names are different, but I read this as "While there is NOT valid grade input do the following"
        while(!validGradeInput){
          String grade = getStringwithPrompt("What is your Letter Grade for course " + (i + 1) + " ?");
          // This is a try/catch block used to run code that could throw an exception (errors).  If the try block runs, the catch will not and vise versa
          try{
            // Instead of creating a function, try using a HashMap or ENUM........
            courses[i] = parseLetterGradeToGPA(grade);
            // Since the above code could throw an exception, if we get below it that means there is no exception!
            validGradeInput = true;
          }
          catch (Exception e){
            // Most times instead of this print statement, we would paste `e.printStackTrace();` but in this example we are trying to handle the error so the code does not crash
            System.err.println("Please enter a letter grade such as: \n A \n B+ \n F \n");
          }
        }
      }
      System.out.println(courses);
      return courses;
  }

  // getDoublewithPrompt takes a prompt to output to the console and returns a double from user input
  public static double getDoublewithPrompt(String prompt){
    System.out.println(prompt);
    double result = input.nextDouble();
    // You could also just return input.nextDouble(), the result variable is not needed
    return result;
  }

  // getDoublewithPrompt takes a prompt to output to the console and returns a int from user input
  public static int getIntwithPrompt(String prompt){
    System.out.println(prompt);
    int result = input.nextInt();
    // You could also just return input.nextInt(), the result variable is not needed
    return result;
  }

  // getDoublewithPrompt takes a prompt to output to the console and returns a String from user input
  public static String getStringwithPrompt(String prompt){
    System.out.println(prompt);
    String result = input.next();
    // You could also just return input.next(), the result variable is not needed
    return result;
  }

  // parseLetterGradeToGPA takes in a string and returns a double.  IF the string is not valid, it will throw an Exception
  public static Double parseLetterGradeToGPA(String letterGrade) throws Exception {
    switch(letterGrade){
          case "A":
            return 4.0;
          case "A-":
            return 3.67;
          case "B+":
            return 3.33;
          case "B":
            return 3.0;
          case "B-":
            return 2.67;
          case "C+":
            return 2.33;
          case "C":
            return 2.0;
          case "D":
            return 1.0;
          case "F":
            return 4.0;
          default:
            throw new Exception("Invalid letter grade");
    }
  }
}