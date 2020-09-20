package by.jrr.ruslan.bean;

import java.util.Objects;

public class Cat extends Mammal {

    private String name;

    public Cat(int countOfLegs, boolean canSwim, String color, boolean mustaches, String name) {
        super(countOfLegs, canSwim, color, mustaches);
        this.name = name;
    }

    public String getName() {
                return name;
    }

    public void setName(String name) {
                this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;
        Cat cat = (Cat) o;
        return Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", countOfLegs=" + countOfLegs +
                '}';
    }

    @Override
    public String voice() {
        return "Myau-Myau";
    }

    public String drinkMilk() {
        return "I drink milk";
    }
}
