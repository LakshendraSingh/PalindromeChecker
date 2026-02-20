import java.util.Scanner;
import java.util.Stack;

/**
 * ============================================================
 * MAIN CLASS - UseCase5PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 5: Stack-Based Palindrome Checker
 *
 * Description:
 * This application validates whether a given string is a 
 * palindrome using a Stack data structure.
 *
 * Key Operations:
 * 1. Push all characters of the input string onto a Stack.
 * 2. Pop characters from the Stack to reverse the string.
 * 3. Compare the original string with the reversed string.
 *
 * @author Developer
 * @version 1.0
 */

public class UseCase5PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Palindrome Checker (Stack-Based) ---");
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is NOT a palindrome.");
        }

        scanner.close();
    }

    /**
     * Checks if a string is a palindrome using a stack.
     *
     * @param str The string to check.
     * @return true if palindrome, false otherwise.
     */
    public static boolean isPalindrome(String str) {
        // Remove spaces and convert to lowercase for better comparison
        String cleanStr = str.replaceAll("\\s+", "").toLowerCase();
        
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < cleanStr.length(); i++) {
            stack.push(cleanStr.charAt(i));
        }

        // Pop and build reversed string
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        // Compare original with reversed
        return cleanStr.equals(reversed.toString());
    }
}
