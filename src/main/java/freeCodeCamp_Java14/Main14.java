package freeCodeCamp_Java14;     // creating classes
import java.util.ArrayList;


public class Main14 {
    public static void main(String[] args) {
        Dog Trelvyn = new Dog("Trelvyn", 6, 4, "dusty and musty" );
        Trelvyn.speak();
        Dog IsIs = new Dog("IsIs", 12, 4, "like a lady cat" );
        IsIs.speak();
        Dog Jimmel = new Dog("Jimmel", 15, 2, "freshly showered" );
        Jimmel.speak();
        Dog Ra = new Dog("Ra", 40, 2, "like a little kid that's been outside playing" );
        Ra.speak();
        Dog Me = new Dog("Me", 45, 2, "like expensive organic deodorant chunks" );
        Me.speak();

        int dogAge = Trelvyn.getAge();
        System.out.println(dogAge);

        Trelvyn.setAge(7);
        Trelvyn.speak();
        // Trelvyn.dogYears();   // still a private method



    }
}
