import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = ""; // Variable to store the user's string
        int choice;

        do {
            // Display the Menu
            System.out.println("\n--- MENU ---");
            System.out.println("1. Enter a string");
            System.out.println("2. Display the string");
            System.out.println("3. Reverse the string");
            System.out.println("4. Count number of words");
            System.out.println("0. Quit");
            System.out.print("Your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Important: consume the "Enter" key left by nextInt()

            if (choice == 1) {
                System.out.print("Enter your text: ");
                text = scanner.nextLine(); // Reads the whole line including spaces [cite: 25]
            }
            else if (choice == 2) {
                System.out.println("Current string: " + text); // [cite: 26]
            }
            else if (choice == 3) {
                // Algorithm to reverse a string manually [cite: 27]
                String reversed = "";
                // Loop backwards from the last character to the first
                for (int i = text.length() - 1; i >= 0; i--) {
                    reversed = reversed + text.charAt(i);
                }
                System.out.println("Reversed string: " + reversed);
            }
            else if (choice == 4) {
                // Count words handling consecutive spaces [cite: 28, 29]
                // 1. Trim() removes spaces at the start and end
                // 2. If empty, count is 0
                if (text.trim().isEmpty()) {
                    System.out.println("Number of words: 0");
                } else {
                    // 3. Split the string wherever there is whitespace ("\\s+")
                    // This automatically handles multiple spaces between words
                    String[] words = text.trim().split("\\s+");
                    System.out.println("Number of words: " + words.length);
                }
            }

            // Pause before showing the menu again [cite: 34]
            if (choice != 0) {
                System.out.println("Press Enter to return to the menu...");
                scanner.nextLine();
            }

        } while (choice != 0);
    }
}