public class GetDigitCount {

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
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
        System.out.println(getDigitCount(123456));
    }

}
