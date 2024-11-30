import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a letter
        System.out.print("Enter a letter: ");
        char letter = input.next().toLowerCase().charAt(0);  // Read the letter and convert it to lowercase

        // Check 
        if (Character.isLetter(letter)) {
            // Check if the letter is a vowel
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                System.out.println(letter + " is a vowel");
            } else {
                System.out.println(letter + " is a consonant");
            }
        } else {
            System.out.println(letter + " is an invalid input");
        }

        // Close the scanner object
        input.close();
    }
}
