public class NumberInWordTutorSolution {

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
    }

    public static void printNumberInWord(int number) {
        
        String numberInWord;
        switch (number) {
            case 0 -> numberInWord = "ZERO";
            case 1 -> numberInWord = "ONE";
            case 2 -> numberInWord = "TWO";
            case 3 -> numberInWord = "THREE";
            case 4 -> numberInWord = "FOUR";
            case 5 -> numberInWord = "FIVE";
            case 6 -> numberInWord = "SIX";
            case 7 -> numberInWord = "SEVEN";
            case 8 -> numberInWord = "EIGHT";
            case 9 -> numberInWord = "NINE";
            default -> numberInWord = "OTHER";
        }
        System.out.println(numberInWord);
    }

}
