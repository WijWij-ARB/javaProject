import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. User input
        System.out.print("Enter a first group verb (ending in 'er'): ");
        String verb = scanner.next();

        // 2. Check validity

        if (verb.endsWith("er")) {

            // 3. Extract the root (radical)

            String root = verb.substring(0, verb.length() - 2);

            // 4. Display conjugation
            System.out.println("je " + root + "e");
            System.out.println("→ tu " + root + "es");
            System.out.println("→ il/elle " + root + "e");
            System.out.println("→ nous " + root + "ons");
            System.out.println("→ vous " + root + "ez");
            System.out.println("→ ils/elles " + root + "ent");



        } else {
            System.out.println("Error: This verb does not end with 'er'.");
        }
    }
}