public class Sum3And5Challenge {

//    public static void main(String[] args) {
//        int isDivisibleBy3And5 = 0;
//        for (int i = 1; i <= 1000; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println(i++);
//            }
//            isDivisibleBy3And5 += i;
//        }
//    }

    public static void main(String[] args) {

        int countOfMatches = 0;
        int sumOfMatches = 0;

        for (int loopNumber = 1; loopNumber <= 1000; loopNumber++) {

            if ((loopNumber % 3 == 0) && (loopNumber % 5 == 0)) {
                countOfMatches++;
                sumOfMatches += loopNumber;
                System.out.println("Found a match = " + loopNumber);
            }

            if (countOfMatches == 5) {
                break;
            }
        }
        System.out.println("Sum = " + sumOfMatches);
    }
}
