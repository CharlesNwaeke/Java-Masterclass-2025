public class EqualityPrinter {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    private static final String ALL_EQUAL_MESSAGE = "All numbers are equal";
    private static final String NEITHER_ALL_EQUAL_MESSAGE = "Neither all are equal or different";
    private static final String ALL_DIFF_MESSAGE = "All numbers are different";

    public static void printEqual(int a, int b, int c) {

        if (a < 0 || b < 0 || c < 0) {
            System.out.println(INVALID_VALUE_MESSAGE);
            return;
        } else if (a == b && b == c) {
            System.out.println(ALL_EQUAL_MESSAGE);
        } else if (a != b && b != c && c != a) {
            System.out.println(ALL_DIFF_MESSAGE);
        } else {
            System.out.println(NEITHER_ALL_EQUAL_MESSAGE);
        }
    }

    public static void main(String[] args) {
        printEqual(1, 1, 1); // should print text All numbers are equal

        printEqual(1, 1, 2); // should print text Neither all are equal nor different

        printEqual(-1, -1, -1); // should print text Invalid Value

        printEqual(1, 2, 3); // should print text All numbers are different
    }

}
