package main;

import java.util.Scanner;

/**
 * main
 */
public class main {

  static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
      String firstName;
      String lastName;
      int numCourses;
      Double[] courses;

      firstName = getStringwithPrompt("What is your first name?");
      lastName = getStringwithPrompt("What is your last name?");
      numCourses = getIntwithPrompt("Hello there " + firstName + " " + lastName + ", how many classes are you taking right now?");
      courses =  getClassGPAs(numCourses);

      Double semesterGPA = getGPA(courses);
      System.out.println("You have a Grade Point Average of: " + semesterGPA);

  }

  public static Double getGPA(Double[] courses){
    Double total = 0.0;
    for (Double course: courses){
        total += course;
    }
    return (total / courses.length);
  }

  public static Double[] getClassGPAs(int numCourses) {
      Double[] courses =  new Double[numCourses];
      for (int i = 0; i < numCourses; i++) {
        courses[i] = getDoublewithPrompt("What is your GPA for course " + (i + 1) + " ?");
      }
      return courses;
  }

  public static double getDoublewithPrompt(String prompt){
    System.out.println(prompt);
    double result = input.nextDouble();
    return result;
  }

  public static int getIntwithPrompt(String prompt){
    System.out.println(prompt);
    int result = input.nextInt();
    return result;
  }

  public static String getStringwithPrompt(String prompt){
    System.out.println(prompt);
    String result = input.next();
    return result;
  }
}