public class SumOfOdd {

    public static void main(String[] args) {

        sumOdd(1, 100); // → should return 2500
        sumOdd(-1, 100); // → should return -1
        sumOdd(100, 100); // → should return 0
        sumOdd(13, 13); // → should return 13 (This set contains one number, 13, and it is odd)
        sumOdd(100, -100); // → should return -1
        sumOdd(100, 1000); // → should return 247500
        
    }

    public static boolean isOdd(int number) {
        // if (number < 0) {
        //     return false;
        // } else if (number % 2 == 0) {
        //     return false;
        // } else {
        //     return true;
        // }
        return number > 0 && number % 2 != 0;
    }

    public static void sumOdd(int start, int end) {

        if (start < 0 || end < 0 || end < start) {
            System.out.println("Invalid input. Please supply a positive integer");
            return;
        }

        int sumOfOddNumber = 0;


        for (int i = start; i <= end; i++) {

            if (isOdd(i)) {
                sumOfOddNumber += i;
            }
        }
        System.out.println(" Sum of odd numbers between " + start + " and " + end + " = " + sumOfOddNumber);

    }

}
