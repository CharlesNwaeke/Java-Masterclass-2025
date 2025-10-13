public class NumberInWord {

    public static void main(String[] args) {
        printNumberInWord(0);
        printNumberInWord(1);
        printNumberInWord(2);
        printNumberInWord(3);
        printNumberInWord(4);
        printNumberInWord(5);
        printNumberInWord(6);
        printNumberInWord(7);
        printNumberInWord(8);
        printNumberInWord(0);
        printNumberInWord(67);

        printNumberSpelling(0);
        printNumberSpelling(1);
        printNumberSpelling(2);
        printNumberSpelling(3);
        printNumberSpelling(4);
        printNumberSpelling(5);
        printNumberSpelling(6);
        printNumberSpelling(7);
        printNumberSpelling(8);
        printNumberSpelling(9);
        printNumberSpelling(69);
        
        
    }
    public static void printNumberInWord(int number) {
        String numberInWord = switch (number) {
            case 0 -> "ZERO";
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 -> "NINE";
            default -> "Other";            
        };
        System.out.println(number + " in words is " + numberInWord);
    }

    public static void printNumberSpelling(int number) {
        
        String numberInWord = "other";
        if (number == 0) {
            numberInWord = "ZERO";
        } else if (number == 1) {
            numberInWord = "ONE";
        } else if (number == 2) {
            numberInWord = "TWO";
        } else if (number == 3) {
            numberInWord = "THREE";
        } else if (number == 4) {
            numberInWord = "FOUR";
        } else if (number == 5) {
            numberInWord = "FIVE";
        } else if (number == 6) {
            numberInWord = "SIX";
        } else if (number == 7) {
            numberInWord = "SEVEN";
        } else if (number == 8) {
            numberInWord = "EIGHT";
        } else if (number == 9) {
            numberInWord = "NINE";
        }
        System.out.println(number + " in words is " + numberInWord);
    }
}
