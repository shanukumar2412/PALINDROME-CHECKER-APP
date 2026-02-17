
public class UseCase1PalindromeCheckerApp {


    private static final String APP_NAME = "Palindrome Checker App";
    private static final String APP_VERSION = "Version 1.0";

    public static void main(String[] args) {


        displayWelcomeMessage();

        System.out.println("\nApplication initialized successfully.");
        System.out.println("Ready to proceed to next use case...");
    }


    private static void displayWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("        " + APP_NAME);
        System.out.println("        " + APP_VERSION);
        System.out.println("=====================================");
    }
}
