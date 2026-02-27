\import java.util.*;

public class UseCase13PalindromeCheckerApp {

    // 1️⃣ Two Pointer Approach
    public static boolean twoPointerCheck(String input) {

        String str = preprocess(input);

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

    // 2️⃣ Stack Based Approach
    public static boolean stackCheck(String input) {

        String str = preprocess(input);

        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : str.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    // 3️⃣ Recursive Approach
    public static boolean recursiveCheck(String input) {
        String str = preprocess(input);
        return recursiveHelper(str, 0, str.length() - 1);
    }

    private static boolean recursiveHelper(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return recursiveHelper(str, start + 1, end - 1);
    }

    // Preprocessing method
    private static String preprocess(String input) {
        return input.toLowerCase().replaceAll("\\s+", "");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        long startTime, endTime;

        // Two Pointer
        startTime = System.nanoTime();
        boolean result1 = twoPointerCheck(input);
        endTime = System.nanoTime();
        long timeTwoPointer = endTime - startTime;

        // Stack
        startTime = System.nanoTime();
        boolean result2 = stackCheck(input);
        endTime = System.nanoTime();
        long timeStack = endTime - startTime;

        // Recursive
        startTime = System.nanoTime();
        boolean result3 = recursiveCheck(input);
        endTime = System.nanoTime();
        long timeRecursive = endTime - startTime;

        System.out.println("\nResults:");
        System.out.println("Two Pointer Result: " + result1 + " | Time: " + timeTwoPointer + " ns");
        System.out.println("Stack Result:       " + result2 + " | Time: " + timeStack + " ns");
        System.out.println("Recursive Result:   " + result3 + " | Time: " + timeRecursive + " ns");

        System.out.println("\nPerformance Comparison:");
        if (timeTwoPointer < timeStack && timeTwoPointer < timeRecursive) {
            System.out.println("Two Pointer approach is fastest.");
        } else if (timeStack < timeRecursive) {
            System.out.println("Stack approach is fastest.");
        } else {
            System.out.println("Recursive approach is fastest.");
        }

        scanner.close();
    }
}