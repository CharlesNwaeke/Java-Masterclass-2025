public class AllFactors {

    public static void printFactors (int number) {
        if (number < 1) {
            System.out.println("Invalid value");
            return;
        }
        int divisor = 1;
        while (divisor <= number) {
           if (number % divisor == 0) {
               System.out.println(divisor);
           }
           divisor++;
        }
    }

    public static void main(String[] args) {
        printFactors(6); // → should print 1 2 3 6
        printFactors(32); // → should print 1 2 4 8 16 32
        printFactors(10); // → should print 1 2 5 10
        printFactors(-1); // → should print "Invalid Value" since number is < 1
    }
}
