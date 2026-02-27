import java.util.Scanner;

public class UseCase10PalindromeCheckerApp {

    // Function to check palindrome using two-pointer approach
    public static boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Normalize string:
        // 1. Convert to lowercase
        // 2. Remove all spaces using regex
        String normalized = input.toLowerCase().replaceAll("\\s+", "");

        if (normalized.length() == 0) {
            System.out.println("Empty string is considered a Palindrome.");
        } else {
            boolean result = isPalindrome(normalized);

            if (result) {
                System.out.println("The given string is a Palindrome (ignoring spaces and case).");
            } else {
                System.out.println("The given string is NOT a Palindrome.");
            }
        }

        scanner.close();
    }
}