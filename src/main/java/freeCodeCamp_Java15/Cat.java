package freeCodeCamp_Java15;

public class Cat extends Dog {

    public String food;

    public Cat(String name, int age, int legs, String smell, String food) {
        super(name, age, legs, smell);
        this.food = food;
    }
    public Cat(String name, int age) {
        super(name, age, 4, "cattish");
    }
    public Cat(String name) {
        super(name, 0, 4, "cattish");
        this.food = "tasty food.";
    }


        public void speak () {
            System.out.println("Meow, I'm " + this.name + " and I like to eat " + this.food + ".");
        }

    }

