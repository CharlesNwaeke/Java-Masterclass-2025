public class Reverse {

    public static int reverse(int number) {

        int reversedNumber = 0;
        int lastDigit = 0;
        int sign = number < 0 ? -1 : 1;
        number = Math.abs(number);

        while (number > 0) {
            lastDigit = number % 10;
            number /= 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
        }

        return reversedNumber * sign;
    }

    public static void main(String[] args) {
        System.out.println(reverse(234));   // prints 432
        System.out.println(reverse(-120));  // prints -21
    }

}
