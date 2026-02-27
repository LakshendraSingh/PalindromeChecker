import java.util.Scanner;

// Service class following OOPS principles
class PalindromeChecker {

    // Public method exposed to client
    public boolean checkPalindrome(String input) {

        if (input == null) {
            return false;
        }

        // Normalize input (ignore case and spaces)
        String normalized = preprocess(input);

        return isPalindrome(normalized);
    }

    // Private helper method for preprocessing
    private String preprocess(String input) {
        return input.toLowerCase().replaceAll("\\s+", "");
    }

    // Internal palindrome logic (Array / Two-pointer technique)
    private boolean isPalindrome(String str) {

        char[] characters = str.toCharArray();

        int left = 0;
        int right = characters.length - 1;

        while (left < right) {
            if (characters[left] != characters[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

// Main Application class
public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PalindromeChecker checker = new PalindromeChecker();

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}