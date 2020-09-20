package by.jrr.ruslan.bean;

import java.util.Objects;

public class Dog extends Mammal{
private  String breed;

public String wagTheTail(){
    return "I always wagging the tail";
}

    public Dog(int countOfLegs, boolean canSwim, String color, boolean mustaches, String breed) {
        super(countOfLegs, canSwim, color, mustaches);
//        this.breed = breed;
    }

    public String getBreed() {
    return breed;
    }

    public void setBreed(String breed) {
    this.breed = breed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(breed, dog.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(breed);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", countOfLegs=" + countOfLegs +
                '}';
    }
}
