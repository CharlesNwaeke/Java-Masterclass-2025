public class DecimalComparator {
    
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        // Multiply both numbers by 1000 to shift decimal places
        // This moves the 3rd decimal place to the units place
        double shifted1 = num1 * 1000;
        double shifted2 = num2 * 1000;
        
        // Cast to int to truncate (remove) all decimal places
        // This effectively keeps only the first 3 decimal places of original numbers
        int truncated1 = (int) shifted1;
        int truncated2 = (int) shifted2;
        
        // Compare the truncated integers
        return truncated1 == truncated2;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(areEqualByThreeDecimalPlaces(-3555.1756, -3.175)); // true
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));    // false
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));        // true
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));   // false
    }
}