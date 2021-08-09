package freeCodeCamp_Java02;

public class Main02 {
    public static void main(String[] args) {
        int x;
        int y;
        int z;
        int sum;
        int div;
        int product;
        double layers;

        double a;
        double b;
        double divb;
        double c;


        x = 777;
        y = 9;
        z = 38;
        sum = x + y + z;
        div = z / y;
        product = x * y * z;
        layers = (x-y*(x*z*y))/z-.5;
        a = 798;
        b = 17659;
        divb = b / a;
        c = Math.pow(5, 4);
        double d = x/ (double)y;
        int e = 56 % 5;                       // modulus gives the remainder of the division -- also known as the remainder

        System.out.println(x);
        System.out.println(y);
        System.out.println(sum);
        System.out.println(product);
        System.out.println(layers);
        System.out.println(div);
        System.out.println(divb);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

    }
}
