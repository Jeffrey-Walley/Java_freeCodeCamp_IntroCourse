package freeCodeCamp_Java09;     // While Loops -- used when you aren't certain how many times you will iterate
import java.util.Scanner;

public class Main09 {
    public static void main(String[] args) {
        Scanner scanny = new Scanner(System.in);

        /* System.out.print("Enter a number: ");
        int x = scanny.nextInt(); */

    // While Loop and While Loop with count
        /* while (x != 10) {
            System.out.println("type 10 to end the program");
            System.out.print("Enter a number: ");
            x = scanny.nextInt(); */

        /* int count = 0;
        while (x != 15) {
            System.out.println("type 15 to exit the program.");
            System.out.print("Enter another number: ");
            x = scanny.nextInt();
            count++;
        }
        System.out.println("You tried " + count + " times"); */

    // Do While Loop

        int x;
        do {
            System.out.print("Enter a whole number : ");
                x = scanny.nextInt();
        } while (x != 15);

        }
    }

