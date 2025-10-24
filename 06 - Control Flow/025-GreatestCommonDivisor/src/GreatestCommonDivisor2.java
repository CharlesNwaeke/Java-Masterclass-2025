public class GreatestCommonDivisor2 {
 
    public static int getGreatestCommonDivisor(int first, int second) {
        
        // Validate input
        if (first < 10 || second < 10) {
            return -1;
        }
 
        // Euclidean algorithm using while loop
        while (second != 0) {
            int temp = second;
            second = first % second;
            first = temp;
        }
        
        return first;
    }
    
    // Test the method
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));   // Expected: 5
        System.out.println(getGreatestCommonDivisor(12, 30));   // Expected: 6
        System.out.println(getGreatestCommonDivisor(9, 18));    // Expected: -1
        System.out.println(getGreatestCommonDivisor(81, 153));  // Expected: 9
        System.out.println(getGreatestCommonDivisor(1701, 3768)); 
    }
}