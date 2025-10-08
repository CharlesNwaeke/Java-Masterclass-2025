public class Evaluate {
    public static void main(String[] args) {
        System.out.println("Testing checkNumber method:");

        System.out.print("checkNumber(1): ");
        PositiveNegativeZero.checkNumber(1);
        System.out.println();

        System.out.print("checkNumber(-5): ");
        PositiveNegativeZero.checkNumber(-5);
        System.out.println();

        System.out.print("checkNumber(0): ");
        PositiveNegativeZero.checkNumber(0);
        System.out.println();

        System.out.print("checkNumber(100): ");
        PositiveNegativeZero.checkNumber(100);
        System.out.println();

        System.out.println("All tests completed!");
    }
}