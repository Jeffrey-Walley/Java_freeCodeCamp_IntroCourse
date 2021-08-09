package freeCodeCamp_Java17;

public class Students implements Comparable<Students>{

    private String name;

    public Students(String name) {
        this.name = name;
    }
    public boolean equals(Students other) {
        if (this.name == other.name) {
            return true;
        } else {
            return false;
        }
    }
    public int compareTo(Students other) {
        return this.name.compareTo(other.name);
    }
    public String toString() {
        return "Students(" + this.name + ")";
    }
}
