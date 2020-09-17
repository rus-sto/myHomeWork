package by.jrr.ruslan.bean;

import java.util.Objects;

public class Dog extends Mammal{
public  String breat;
public String wagTheTail(){
    return "I always wagging the tail";
}

    public Dog(int countOfLegs, boolean canSwim, String color, boolean mustaches, String breat) {
        super(countOfLegs, canSwim, color, mustaches);
        this.breat = breat;
    }

    public String getBreat() {
        return breat;
    }

    public void setBreat(String breat) {
        this.breat = breat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(breat, dog.breat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(breat);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breat='" + breat + '\'' +
                ", mustaches=" + mustaches +
                ", countOfLegs=" + countOfLegs +
                ", canSwim=" + canSwim +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public String voice() {
        return "RRHau-rrhau";
    }
}
