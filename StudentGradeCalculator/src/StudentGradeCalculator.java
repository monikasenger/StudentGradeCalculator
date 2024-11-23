import java.util.Scanner;

/**
 * class to handle grade calculations
  */

class GradeCalculator {
    private Scanner sc = new Scanner(System.in); // scanner for user input

    // method to calculate grades
    public void calculateGrades() {
        // prompt user for the number of grades
        System.out.println("\nEnter the number of grades: ");
        int numberOfGrades = sc.nextInt(); // get the number of grades from the user

        // create an array to store the grades
        double[] grades = new double[numberOfGrades]; // array to hold the grades
        double total = 0; // variable to accumulate the total grades

        // loop to input each grade and add it to the total
        for (int i = 0; i < numberOfGrades; i++) {
            System.out.print("Enter grade '" + (i + 1) + "' : "); // prompt for each grade
            grades[i] = sc.nextDouble(); // store the grade in the array
            total += grades[i]; // add the grade to the total
        }

        // calculate the average grade
        double average = total / numberOfGrades; // compute the average grade

        // display the calculated average
        System.out.printf("The average grade is: %.2f%n", average);
    }
}

