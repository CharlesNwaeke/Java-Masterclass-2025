public class MethodOverloadingChallenge {
    private static final double INCHES_TO_CM = 2.54;
    private static final int INCHES_PER_FOOT = 12;

    public static double convertToCentimeters(int heightInInches) {
        if (heightInInches < 0) {
            return -1;
        }
        return heightInInches * INCHES_TO_CM;
    }

    public static double convertToCentimeters(int heightInFeet, int heightInInches) {
        if (heightInFeet < 0 || heightInInches < 0 || heightInInches > 11) {
            return -1;
        }
        int totalInches = (heightInFeet * INCHES_PER_FOOT) + heightInInches;
        return convertToCentimeters(totalInches);
    }

    public static void main(String[] args) {
        System.out.println("68 inches = " + convertToCentimeters(68) + " cm");
        System.out.println("5 feet 8 inches = " + convertToCentimeters(5, 8) + " cm");
        System.out.println("6 feet, 3 inches = " + convertToCentimeters(6, 3) + " cm");
    }
}