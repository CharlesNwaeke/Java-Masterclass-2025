public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        int MegaBytesAndKiloBytes = kiloBytes / 1024;
        int remainingKiloBytes = kiloBytes % 1024;

        if (kiloBytes < 0) {
            System.out.println("Invalid value");
            return;
        }
        System.out.println(kiloBytes + " KB = " + MegaBytesAndKiloBytes + " MB and " + remainingKiloBytes + " KB");

    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(5000);
    }
}
