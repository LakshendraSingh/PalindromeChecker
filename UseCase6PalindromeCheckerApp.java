import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class UseCase6PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Palindrome Checker (Queue + Stack) ---");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        // Clean the string: remove non-alphanumeric characters and convert to lowercase
        String cleanedStr = str.replaceAll("[^a-zA-Z0-Math]", "").toLowerCase();
        
        if (cleanedStr.isEmpty()) {
            return true;
        }

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue and Push characters
        for (int i = 0; i < cleanedStr.length(); i++) {
            char ch = cleanedStr.charAt(i);
            queue.add(ch);
            stack.push(ch);
        }

        // Compare Dequeue vs Pop
        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                return false;
            }
        }

        return true;
    }
}
