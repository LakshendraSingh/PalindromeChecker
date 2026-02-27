import java.util.Scanner;

public class UseCase9PalindromeCheckerApp {

    // Recursive function to check palindrome
    public static boolean isPalindrome(String str, int start, int end) {

        // Base Condition: If pointers have crossed or are equal
        if (start >= end) {
            return true;
        }

        // If characters at start and end don't match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call for next inner characters
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Optional normalization
        input = input.toLowerCase();

        if (input.length() == 0) {
            System.out.println("Empty string is considered a Palindrome.");
        } else {
            boolean result = isPalindrome(input, 0, input.length() - 1);

            if (result) {
                System.out.println("The given string is a Palindrome.");
            } else {
                System.out.println("The given string is NOT a Palindrome.");
            }
        }

        scanner.close();
    }
}