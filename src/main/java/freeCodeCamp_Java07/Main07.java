package freeCodeCamp_Java07;    // Arrays -- collection of elements -- remember indexes start at "0"

public class Main07 {
    public static void main(String[] args) {

        String[] stringArray = new String[5];     // a way to make an array

        stringArray[0] = "Howdy";
        stringArray[1] = "Hello";
        stringArray[2] = "Hey";
        stringArray[3] = "Hi";
        stringArray[4] = "Hola";

        int[] intArray = {2, 15, 85, 42, 9};     // a way to make an array

        String strang = stringArray[3];
        int num = intArray[4];

        System.out.println(strang);
        System.out.println(num);

    }
}
