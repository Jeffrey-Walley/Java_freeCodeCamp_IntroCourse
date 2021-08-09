package freeCodeCamp_Java18;

public class OuterClass {
   /* public class InnerClass {
         public void display() {
            System.out.println("This is the other Inner Class Talking, yes, i'm talking 2!");
        }
    }

    public void inner() {
        InnerClass ic = new InnerClass();
        ic.display();
    }
} */

    public void inner() {
        class InnerClass {
            public void display() {
                System.out.println("Inner Class speaking");
            }
        }

        InnerClass in = new InnerClass();
        in.display();
    }

}
