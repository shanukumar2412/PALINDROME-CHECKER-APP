import java.util.Scanner;
import java.util.Stack;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        if (isPalindrome(input)) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }
        
        scanner.close();
    }

    public static boolean isPalindrome(String input) {
        
        // Normalize input (remove spaces & special characters, convert to lowercase)
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        Stack<Character> stack = new Stack<>();
        
        // Push all characters into stack
        for (int i = 0; i < cleaned.length(); i++) {
            stack.push(cleaned.charAt(i));
        }
        
        // Compare original string with reversed (stack pop)
        for (int i = 0; i < cleaned.length(); i++) {
            if (cleaned.charAt(i) != stack.pop()) {
                return false;
            }
        }
        
        return true;
    }
}
