public class UsePalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        boolean isPalindrome = word.equals(reversed);

        System.out.println("Input text: " + word);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}