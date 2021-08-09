package freeCodeCamp_Java08;         // For Loops\
import java.util.Scanner;

public class Main08 {
    public static void main(String[] args) {
        int x = 0;
        x += 1;
        x += 2;
        x += 3;

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        };

        int[] numArray = {7, 16, 9, 85, 35};

        for (int i = 0; i < numArray.length; i++) {    // iterates through the Array
            if (numArray[i] == 85) {
                System.out.println("found an 85 at index " + i);
            };
        }
        System.out.println(x);

// For Each Loop

        int[] newerArray = {18, 19, 27, 4, 35};
        String[] names = new String[5];

        for (int element:newerArray) {                 // element will iterate through the indexes, also
            System.out.println(element);
        }

        int count = 0;                                 // implement a 'count' to count the iterations
        for (int element:newerArray) {
            System.out.println(element + " " + count);
            count++;
        }

        Scanner scanny = new Scanner(System.in);

        for (int i = 0; i < names.length; i++) {
            System.out.print("Input a Name: ");
            String input = scanny.nextLine();
            names[i] = input;
        }

        for (String n:names) {                           // adds the input to the array, will break if it encounters "Trelvyn"
            System.out.println(n);
            if (n.equals("Trelvyn")) {
                break;
            }
        }




    }
}
