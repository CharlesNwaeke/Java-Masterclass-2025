public class MinutesToYearsAndDaysCalculator {

    private static final int MIN_PER_HOUR = 60;
    private static final int HOURS_PER_DAY = 24;
    private static final int DAYS_PER_YEAR = 365;
    private static final int MIN_PER_DAY = HOURS_PER_DAY * MIN_PER_HOUR;
    private static final int MIN_PER_YEAR = MIN_PER_HOUR * HOURS_PER_DAY * DAYS_PER_YEAR;

    public static void printYearsAndDays(long minutes) {

        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        long years = minutes / MIN_PER_YEAR;
        long days = (minutes / MIN_PER_DAY) % DAYS_PER_YEAR;

        System.out.println(minutes + " min = " + years + " y and " + days + " d");
    }

    public static void main(String[] args) {
        printYearsAndDays(525600); // → should print "525600 min = 1 y and 0 d"
        printYearsAndDays(1051200); // → should print "1051200 min = 2 y and 0 d"
        printYearsAndDays(561600);  // → should print "561600 min = 1 y and 25 d"
        printYearsAndDays(-561600);
    }
}
