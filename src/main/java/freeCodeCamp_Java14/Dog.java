package freeCodeCamp_Java14;

public class Dog {
    private String name;
    private int age;
    private int legs;
    private String smell;


    public Dog(String name, int age, int legs, String smell) {
        this.name = name;
        this.age = age;
        this.legs = legs;
        this.smell = smell;
        dogYears();
    }
    public void speak() {
        System.out.println("Dog's name: " + this.name + " Age: " + this.age + " Number of Legs: " + this.legs + " " +this.name + ", smells like: " + this.smell);
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    private int dogYears() {
        return this.age * 7;
    }
}
