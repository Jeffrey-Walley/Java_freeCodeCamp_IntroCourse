package freeCodeCamp_Java19;

public interface Vehicle {

    final int gear = 5;

    void changeGear(int a);
    void speedUp(int a);
    void slowDown(int a);

    default void out() {                                    // will make it default from any class that inherits the interface
        System.out.println("Default");
    }

    static int sum(int b) {
        return b + 9;
    }

}
