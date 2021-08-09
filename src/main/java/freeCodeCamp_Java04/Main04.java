package freeCodeCamp_Java04;      // Conditions and Booleans

public class Main04 {
    public static void main(String[] args) {
        int x = 6;
        int y = 12;
        int z = 15;
        String a = "Hello";
        String b = "Howdy";

        // Comparative Operators: '<' less than; '>' greater than; '==' is equal to;
        // '>=' greater than or equal; '<=' less than or equal; '!=" not equal to;

        boolean compare = x < y;
        boolean compare2 = z < x;
        boolean compare3 = z > x;
        boolean compare4 = a == b;
        boolean compare5 = a != b;

        // Chaining Operators '&&' 'and' operator

        boolean compare6 = x < y && z > y;
        boolean compare7 = x < y && z < y;

        // '||' 'or' operator

        boolean compare8 = x < y || z > y;
        boolean compare9 = x < y || z < y;
        boolean compare10 = (x < y && y > z)||(z + 2 < y +x || x + 7 > y);


        System.out.println(compare);
        System.out.println(compare2);
        System.out.println(compare3);
        System.out.println(compare4);
        System.out.println(compare5);
        System.out.println(compare6);
        System.out.println(compare7);
        System.out.println(compare8);
        System.out.println(compare9);
        System.out.println(compare10);


    }
}
