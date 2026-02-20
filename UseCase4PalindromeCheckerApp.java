import java.util.Scanner;

/**
 * ============================================================
 * MAIN CLASS - UseCase4PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 4: Character Array Based Palindrome Check
 *
 * Goal: Convert string to character array and compare characters.
 *
 * Flow:
 * 1. Convert string to char[]
 * 2. Use two-pointer approach
 * 3. Compare start & end characters
 *
 * Key Concepts:
 * - Character Array (char[])
 * - Array Indexing
 * - Two-Pointer Technique
 * - Time Complexity Awareness
 *
 * @author Developer
 * @version 1.0
 */
public class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Palindrome Checker App (UC4)");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert string to character array
        char[] charArray = input.toCharArray();

        // Use two-pointer approach to check palindrome
        boolean isPalindrome = true;
        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            // Compare start & end characters
            if (charArray[start] != charArray[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display the result
        if (isPalindrome) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a palindrome.");
        }

        scanner.close();
    }
}
