// 'If', 'Else', 'Else/If' Statements
package freeCodeCamp_Java05;
import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) {
        Scanner scanny = new Scanner(System.in);
        String strang = scanny.nextLine();

        if (strang.equals("Trelvyn")) {
            System.out.println("Dude, Trelvyn, I LOVE You!!");
        } else if (strang.equals("Jim")) {
            System.out.println("It's my First and FAVORITE Son");
        } else if (strang.equals("Me")) {
            System.out.println("It's me, that's about all I have to say about that");
        } else {
            System.out.println("I miss Trelvyn");
        }
    }
}
