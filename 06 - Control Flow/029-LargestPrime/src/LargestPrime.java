public class LargestPrime {



    public static int getLargestPrime(int number) {

        if (number < 2) {
            System.out.println("Invalid value");
            return -1;
        }

        int factor = -1;
        for (int i = 2; i * i <= number; i++) {
            if (number % i != 0) {
                continue;
            }
            factor = i;
            while (number % i == 0) {
                number /= i;
            }
        }
        System.out.println(number == 1 ? factor : number);
        return number == 1 ? factor : number;
    }


    public static void main(String[] args) {
        getLargestPrime (21);   // should return 7 since 7 is the largest prime (3 * 7 = 21)
        getLargestPrime (217);  // should return 31 since 31 is the largest prime (7 * 31 = 217)
        getLargestPrime (0);    // should return -1 since 0 does not have any prime numbers
        getLargestPrime (45);   // should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)
        getLargestPrime (-1);   // should return -1 since the parameter is negative
    }
}
