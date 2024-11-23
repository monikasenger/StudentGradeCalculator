import java.util.Scanner;

/**
 * main class to manage the user interaction
 */

public class StudentGradeCalculator_Main {
  static Scanner sc = new Scanner(System.in); // scanner for user input
     static char ans; // user choice variabele

    public static void main(String[] args) {
        System.out.println("\n*************** STUDENT GRADE CALCULATOR ***************");

        // create GradeCalculator class instance
        GradeCalculator gradeCalculator = new GradeCalculator();

        // loop to allow multiple grade calculations
        do {
            gradeCalculator.calculateGrades(); // call the calculateGrades method

            // ask the user if they want to calculate grades for another student
            System.out.println("\nDo you want to calculate more student grades? (Y/N): ");
            ans = sc.next().charAt(0); // get the user's input ('Y' or 'N')
        } while (ans == 'y' || ans == 'Y'); // continue if the user enters 'y' or 'Y'

        // exit message
        System.out.println("\nThank You :)"); // thank the user for using the program
    }
}