public class Main {

    static void main() {
        System.out.println(isPalindrome(-1221)); // → should return true
        System.out.println(isPalindrome(707));   // → should return true
        System.out.println(isPalindrome(11212)); // → should return false because reverse is 21211 and that is not equal to 11212.
    }

    public static boolean isPalindrome(int number) {

        int reverse = 0;                            // Step 1: Variable to store the reversed number
        int original = number;                      // Step 2: Keep the original number for comparison

        while (original != 0) {                     // Step 3: Loop until all digits are processed

            reverse = reverse * 10 + original % 10; // Get last digit and build reverse
            original /= 10;                         // Remove the last digit from original
        }
        return reverse == number;                   // Step 4: Compare reversed with original
    }
}
