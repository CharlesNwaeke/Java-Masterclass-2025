public class GreatestCommonDivisor {

    public static void getGreatestCommonDivisor (int first, int second) {
        if (first < 10 || second < 10) {
            System.out.println("Invalid value");
            return;
        }

        int min = first < second ? first : second;
        int gcd = 1;
        for (int i = 1; i <= min; i++) {
            if (first % i == 0 && second % i == 0) {
                gcd = i;
            }
        }
        System.out.println(gcd);
    }

    public static void main(String[] args) {
        getGreatestCommonDivisor(25, 15); // should return 5 since both can be divided by 5 without a remainder
        getGreatestCommonDivisor(12, 30); // should return 6 since both can be divided by 6 without a remainder
        getGreatestCommonDivisor(9, 18);  // should return -1 since the first parameter is < 10
        getGreatestCommonDivisor(81, 153); // should return 9 since both can be divided by 9 without a remainder
    }

}
