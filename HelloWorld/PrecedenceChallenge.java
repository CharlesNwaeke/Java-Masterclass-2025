public class PrecedenceChallenge {
    public static void main(String[] args) {
        double firstDouble = 20.00;
        double secondDouble = 80.00;
        double doublesTotal = (firstDouble + secondDouble) * 100.00;
        System.out.println("total = " + doublesTotal);
        double theRemainder = doublesTotal % 40.00;
        System.out.println("theRemainder = " + theRemainder);

        boolean isNoRemainder = (theRemainder == 0.00) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);

        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
