public class LastDigitChecker {

    public static boolean hasSameLastDigit (int n1, int n2, int n3) {

        // return (n1 >= 10 && n1 <= 1000) && (n2 >= 10 && n2 <= 1000) && (n3 >= 10 && n3 <= 1000);

        if (!isValid(n1) || !isValid(n2) || !isValid(n3)) {
            return false;
        }

        int n1RightmostDigit = n1 % 10;
        int n2RightmostDigit = n2 % 10;
        int n3RightmostDigit = n3 % 10;

        boolean n1Shared = ((n1RightmostDigit == n2RightmostDigit) || (n1RightmostDigit == n3RightmostDigit));
        boolean n2Shared = ((n2RightmostDigit == n1RightmostDigit) || (n2RightmostDigit == n3RightmostDigit));
        // boolean n3Shared = ((n3RightmostDigit == n1RightmostDigit || n3RightmostDigit == n2RightmostDigit));

        return n1Shared || n2Shared; // || n3Shared;
    }

    public static boolean isValid (int number) {

        return number >= 10 && number <= 1000;
    }

    public static void main(String[] args) {
        System.out.println("hasSameLastDigit");
        System.out.println(hasSameLastDigit (41, 22, 71)); // → should return true since 1 is the rightmost digit in numbers 41 and 71
        System.out.println(hasSameLastDigit (23, 32, 42)); // → should return true since 2 is the rightmost digit in numbers 32 and 42
        System.out.println(hasSameLastDigit (9, 99, 999)); // → should return false since 9 is not within the range of 10-1000
        System.out.println("isValid");
        System.out.println(isValid(10)); // → should return true since 10 is within the range of 10-1000
        System.out.println(isValid(468)); // → should return true since 468 is within the range of 10-1000
        System.out.println(isValid(1051)); // → should return false since 1051 is not within the range of 10-1000
    }


}
