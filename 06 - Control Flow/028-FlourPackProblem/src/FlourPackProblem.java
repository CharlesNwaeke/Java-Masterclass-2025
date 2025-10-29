public class FlourPackProblem {

    public static final int BIG_WEIGHT = 5;
    // final int smallCount = 1;

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        }
        boolean result = false;
        int totalBigWeight = bigCount * BIG_WEIGHT;
        if (totalBigWeight >= goal) {
            int remainingWeight = goal % BIG_WEIGHT;
            if (smallCount >= remainingWeight) {
                result = true;
            }
        } else {
            if (smallCount >= goal - totalBigWeight) {
                result = true;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4)); // should return false since bigCount is 1 (big bag of 5 kilos) and goal is 4 kilos.
        System.out.println(canPack(1, 0, 5)); // should return true since bigCount is 1 (big bag of 5 kilos) and goal is 5 kilos.
        System.out.println(canPack(0, 5, 4)); // should return true since smallCount is 5 (small bags of 1 kilo) and goal is 4 kilos, and we have 1 bag left which is ok as mentioned above.
        System.out.println(canPack(2, 2, 11)); // should return true since bigCount is 2 (big bags 5 kilos each) and smallCount is 2 (small bags of 1 kilo), makes in total 12 kilos and goal is 11 kilos. 
        System.out.println(canPack(-3, 2, 12)); // should return false since bigCount is negative.
    }

}
