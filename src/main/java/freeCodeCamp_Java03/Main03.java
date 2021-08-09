package freeCodeCamp_Java03;
import java.util.Scanner;                  // import Scanner so we can grab inputs

public class Main03 {
    public static void main(String[] args) {
        Scanner chumps = new Scanner(System.in);  // Scanner (data type is named 'chumps'
                 // and it is equal to a new Scanner that is expecting input (from the keyboard unless specified)
        String scanned = chumps.next();

        Scanner digis = new Scanner(System.in);
        int digiScan = digis.nextInt();  // Scanner for 'int'

        Scanner dubs = new Scanner(System.in);
        int dubScan = dubs.nextInt();  // Scanner for 'double'

        Scanner bools = new Scanner(System.in);
        boolean boolScan = bools.nextBoolean();

        // best practice is to take all input in as a 'String' and then parse the data
        Scanner scanny = new Scanner(System.in);
        String scannyScan = scanny.next();
        int x = Integer.parseInt(scannyScan);   // parse as an integer

        System.out.println(scanned);
        System.out.println(digiScan);
        System.out.println(boolScan);
        System.out.println(dubScan);
        System.out.println(scannyScan);
    }

}
