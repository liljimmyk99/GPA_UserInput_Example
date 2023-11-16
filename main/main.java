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
        courses[i] = getDoublewithPrompt("What is your GPA for course " + (i + 1) + " ?");
      }
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
}