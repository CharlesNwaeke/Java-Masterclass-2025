public class SecondsAndMinutesChallenge {

    public static void main(String[] args) {
        System.out.println(getDurationString(3945)); // This is a test case
        System.out.println(getDurationString(65, 45)); // This is a second test case

        System.out.println(getDurationString(-3945)); // This is a test case
        System.out.println(getDurationString(65, 86)); // This is a second test case
    }

    public static String getDurationString (int seconds) {

        if (seconds < 0) {
            return "Invalid data for seconds (" + seconds + "). It must be a positive integer";
        }

        // int Hours = (seconds / 60) / 60;
        // Two-step approach to get hours
        int minutes = seconds / 60;
        // int hours = minutes / 60;
        // System.out.println("hours = " + hours);

        // int hours1 = seconds / 3600;
        // System.out.println("hours1 = " + hours1);

        // int remainingMinutes = minutes % 60;
        // System.out.println("minutes = " + minutes);
        // System.out.println("remainingMinutes = " + remainingMinutes);

        // int remainingSeconds = seconds % 60;
        // System.out.println("remainingSeconds = " + remainingSeconds);

        //return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
        return getDurationString(seconds / 60, seconds % 60);

    }

    public static String getDurationString (int minutes, int seconds) {

        if (minutes < 0) {
            return "Invalid data for minutes (" + minutes + "). It must be a positive integer";
        }

        if (seconds < 0 || seconds > 59) {
            return "Invalid submission for seconds (" + seconds + "). It must be within the range of 0 and 59";
        }

        int hours = minutes / 60;

        int remainingMinutes = minutes % 60;
        // int remainingSeconds = seconds % 60;

        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }
}
