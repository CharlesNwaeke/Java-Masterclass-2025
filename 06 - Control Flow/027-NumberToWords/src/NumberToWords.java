public class NumberToWords {

    public static final String ONE = "One";
    public static final String TWO = "Two";
    public static final String THREE = "Three";
    public static final String FOUR = "Four";
    public static final String FIVE = "Five";
    public static final String SIX = "Six";
    public static final String SEVEN = "Seven";
    public static final String EIGHT = "Eight";
    public static final String NINE = "Nine";
    public static final String ZERO = "Zero";

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        if (number == 0) {
            System.out.println(ZERO);
            return;
        }

        int leadingZeros = getDigitCount(number) - getDigitCount(reverse(number));
        number = reverse(number);
        int lastDigit = 0;
        while (number > 0) {
            lastDigit = number % 10;
            switch (lastDigit) {
                case 0 -> System.out.println(ZERO);
                case 1 -> System.out.println(ONE);
                case 2 -> System.out.println(TWO);
                case 3 -> System.out.println(THREE);
                case 4 -> System.out.println(FOUR);
                case 5 -> System.out.println(FIVE);
                case 6 -> System.out.println(SIX);
                case 7 -> System.out.println(SEVEN);
                case 8 -> System.out.println(EIGHT);
                case 9 -> System.out.println(NINE);
                default -> System.out.println("Invalid value");
            }
            number /= 10;
        }
        for (int i = 0; i < leadingZeros; i++) {
            System.out.println(ZERO);
        }
    }

    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }

        int digitCount = 0;
        int lastDigit = 0;
        while (number > 0) {
            lastDigit = number % 10;
            number /= 10;
            digitCount++;
        }
        
        return digitCount;
    }

    public static void main(String[] args) {
        System.out.println("Example Input/Output - reverse method");
        System.out.println(getDigitCount(0));       // should return 1 since there is only 1 digit
        System.out.println(getDigitCount(123));     // should return 3
        System.out.println(getDigitCount(-12));     // should return -1 since the parameter is negative
        System.out.println(getDigitCount(5200));    //should return 4 since there are 4 digits in the number

        System.out.println("Example Input/Output - reverse method");

        System.out.println(reverse(-121));      // should  return -121
        System.out.println(reverse(1212));      // should return  2121
        System.out.println(reverse(1234));      // should return 4321
        System.out.println(reverse(100));       // should return 1

        System.out.println("Example Input/Output - numberToWords method");

        numberToWords(123);     // should print "One Two Three".
        numberToWords(1010);    // should print "One Zero One Zero".
        numberToWords(1000);    // should print "One Zero Zero Zero".
        numberToWords(-12);     // should print "Invalid Value" since the parameter is negative.
        numberToWords(0);
    }
}
