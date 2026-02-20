import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class UseCase7PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Palindrome Checker (Deque Based) ---");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
        scanner.close();
    }

    public static boolean isPalindrome(String input) {
        // Cleaning input: remove non-alphanumeric and convert to lowercase for comparison
        String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        if (cleanedInput.isEmpty()) {
            return true;
        }

        Deque<Character> deque = new LinkedList<>();

        // Enqueue characters into the deque
        for (char ch : cleanedInput.toCharArray()) {
            deque.addLast(ch);
        }

        // Compare front and rear elements
        while (deque.size() > 1) {
            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (first != last) {
                return false;
            }
        }

        return true;
    }
}
