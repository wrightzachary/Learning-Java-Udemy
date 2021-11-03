public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        // invalid options
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        // variables
        int megaBytes = 0; // store megabytes converted to kilobytes
        int remainder = 0; // remainder of kilobytes

        // calculations 1 MB = 1024 KB
        megaBytes = kiloBytes / 1024; // conversion equation
        remainder = kiloBytes % 1024; // remainder

        // output
        System.out.println(kiloBytes + " KB " + megaBytes + " MB and " + remainder + " KB");

    }
}
