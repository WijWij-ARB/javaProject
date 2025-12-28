import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Create an array of 26 integers (one for each letter A-Z)

        int[] occurrences = new int[26];

        System.out.print("Enter a line of text: ");
        String text = scanner.nextLine();

        // 2. Convert everything to uppercase

        text = text.toUpperCase();

        // 3. Loop through every character in the text
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);

            if (letter >= 'A' && letter <= 'Z') {

                int index = letter - 'A';

                occurrences[index]++;
            }
        }

        // 4. Display the results
        System.out.println("The string \"" + text + "\" contains:");

        for (int i = 0; i < 26; i++) {
            if (occurrences[i] > 0) {
                char currentLetter = (char) (i + 'A');
                System.out.println(occurrences[i] + " occurrence(s) of the letter '" + currentLetter + "'");
            }
        }
    }
}