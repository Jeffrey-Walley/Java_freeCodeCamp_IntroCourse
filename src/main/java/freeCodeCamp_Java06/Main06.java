package freeCodeCamp_Java06;          // Nested Statements
import java.util.Scanner;

public class Main06 {
    public static void main(String[] args) {
        System.out.print("Input your age: ");
        Scanner scanny = new Scanner(System.in);
        String strang = scanny.nextLine();
        int age = Integer.parseInt(strang);

        if ( age >= 18) {
            System.out.print("Input your your Favorite Food: ");
            String strangFood = scanny.nextLine();

            if (strangFood.equals("pizza")) {
                System.out.println("Mine too");
            }
            else {
                System.out.println("Nasty as shite, I can't stomach any food other than 'pizza'");
            }
        } else if (age >= 13) {
            System.out.println("You are a Teenager");
        }
        else {
            System.out.println("You're still a Kid");
        }

    }
}
