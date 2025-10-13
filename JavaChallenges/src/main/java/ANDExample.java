public class ANDExample {

    public static void main(String[] args) {
        int x = 5;  // binary: 0101
        int y = 3;  // binary: 0011

        // Bitwise AND
        int bitwiseResult = x & y;  // 0101 & 0011 = 0001 (decimal 1)
        System.out.println("Bitwise AND result: " + bitwiseResult);

        // Logical AND
        boolean a = true;
        boolean b = false;
        boolean logicalResult = a && b;  // false
        System.out.println("Logical AND result: " + logicalResult);
    }

}
