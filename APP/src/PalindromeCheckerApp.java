package PACKAGE_NAME;

public class PalindromeCheckerApp
{
    public static void main(String[] args) {

        // Hardcoded string
        String input = "madam";

        // Assume it is a palindrome initially
        boolean isPalindrome = true;

        // Compare characters from both ends
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a palindrome.");
        }
    }
}
