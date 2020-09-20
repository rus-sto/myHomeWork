package by.jrr.ruslan.bean;

import java.util.Objects;

public class Parrot extends Birds{

    private String name;

    public Parrot(int countOfLegs, boolean canSwim, String color, String beakColor, String name) {
        super(countOfLegs, canSwim, color, beakColor);
        this.name = name;
    }

    public String speak(){
        return (" Hello, I'm " + name +" and I can really speak");
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
        if (!(o instanceof Parrot)) return false;
        Parrot parrot = (Parrot) o;
        return Objects.equals(name, parrot.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "name='" + name + '\'' +
                ", countOfLegs=" + countOfLegs +
                '}';
    }
}
