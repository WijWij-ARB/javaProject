import java.util.Scanner;
import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Set up the array
        System.out.print("How many grades do you want to enter? ");
        int n = scanner.nextInt();
        double[] grades = new double[n];
        // 2. Fill the array with user input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
        }

        // 3. Sort and display the list

        Arrays.sort(grades);

        System.out.print("Sorted grades: ");
        for (int i = 0; i < n; i++) {
            System.out.print(grades[i] + " ");
        }
        System.out.println();

        // 4. Calculate Average, Max, and Min
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + grades[i];
        }
        double average = sum / n;

        System.out.println("Average grade: " + average);
        System.out.println("Lowest grade: " + grades[0]);
        System.out.println("Highest grade: " + grades[n - 1]);

        // 5. Count occurrences of a specific grade
        System.out.print("Enter a grade to count how many students got it: ");
        double targetGrade = scanner.nextDouble();
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (grades[i] == targetGrade) {
                count++;
            }
        }

        System.out.println("Number of students with grade " + targetGrade + ": " + count);
    }
}