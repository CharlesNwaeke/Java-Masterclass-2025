public class Main {

    public static void main(String[] args) {

        // first type of while loop
        // int j = 1;
        // while (j <= 5) {
        //     System.out.println(j);
        //     j++;
        // }

        // second type of while loop
        // int j = 1;
        // while (true) {
        //     if (j > 5) {
        //         break;
        //     }
        //     System.out.println(j);
        //     j++
        // }

        // do while
        // int j = 1;
        // boolean isReady = false;
        // do {
        //     if (j > 5) {
        //         break;
        //     }
        //     System.out.println(j);
        //     j++;
        //     isReady = ( j > 0);
        // } while (isReady);

        int number = 0;
        while (number < 50) {
            number += 5;
            if (number % 20 == 0) {
                continue;
            }
            System.out.print(number + "_");
        }
    }
}
