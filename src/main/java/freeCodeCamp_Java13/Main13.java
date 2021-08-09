package freeCodeCamp_Java13; // Intro to Objects
import java.util.ArrayList;
import java.util.Scanner;

public class Main13 {
    public static void main(String[] args) {
        Scanner scanny = new Scanner(System.in);
        // scanny.next();                              // the method '.next' can be used on Scanners

        stump("this strang got me stumped, stumpy", 777); // "this strang got me stumped..." printed 778 times

        System.out.println(add2(6));
        System.out.println(nudeString("this shit got me bussin', chumps"));
    }

    public static void stump(String strang, int numby) {
        for (int i = 0; i < numby; i++) {
            System.out.println(strang);
        }

    }
    public static int add2(int x) {
        return x + 2;
    }

    public static String nudeString(String stringy) {
         return stringy + "!";
    }
}