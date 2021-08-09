package freeCodeCamp_Java17;

public class Main17 {
    public static void main(String[] args) {

        Students trelvyn = new Students("Trelvyn");
        Students isis = new Students("Isis");
        Students jimmel = new Students("Jimmel");
        Students ra = new Students("Ra");
        Students me = new Students("Me");


        System.out.println(trelvyn == isis);      // doesn't give a valid comparison
        System.out.println(trelvyn.equals(ra));   // you have to set up a method to get it to actually work
        System.out.println(jimmel.compareTo(ra) > 0); // gives -8
        System.out.println(jimmel.compareTo(me));
        System.out.println(trelvyn);               // returns freeCodeCamp_Java17.Students@2c7b84de not the info i'm looking for, but the memory location of 'trelvyn' in the program
        System.out.println(trelvyn);                // now returns 'Students(Trelvyn)' because of the 'toString' method in 'Students.java'
        System.out.println(trelvyn.toString());     // this also works to print out the above line 'Students(Trelvyn)'
    }
}
