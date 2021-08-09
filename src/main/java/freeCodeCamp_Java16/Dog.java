package freeCodeCamp_Java16;         // Understanding 'Static'

public class Dog {

    // Static Variable (count)

    protected static int count = 0;   // creates a static int named 'count' which is equal to 0;

    protected String name;
    protected int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        Dog.count += 1;                     // this will add one to the count for every Dog created
        Dog.display();
        // Dog.display2();                  // this gives an error
    }

   // Static Method (

    public static void display() {
        System.out.println("I am a Dog");
    }

    public void display2() {
        System.out.println("also a dog, i'm dog 2");
    }

}
