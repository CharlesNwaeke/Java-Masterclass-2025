public class Main {

    public static void main(String[] args) {

        int i = 5;
        int j = 20;
        int evenNumbersFound = 0;
        int oddNumbersFound = 0;

        while (i <= j) {
            if (isEvenNumber(i)) {
                System.out.println(i);
                evenNumbersFound++;
            } else {
                oddNumbersFound++;
            }
            i++;
            if (evenNumbersFound == 5) {
                break;
            }
        }
        System.out.println(evenNumbersFound + " even numbers found and " 
        + oddNumbersFound + " odd numbers found");
    }

    public static boolean isEvenNumber(int number) {

        return number % 2 == 0;

    }
}