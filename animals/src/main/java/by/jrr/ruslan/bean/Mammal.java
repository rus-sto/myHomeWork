package by.jrr.ruslan.bean;

public abstract class Mammal extends Animal{

    public boolean mustaches;
    public String run(){
        return "running fast";
    }

    public Mammal(int countOfLegs, boolean canSwim, String color, boolean mustaches) {
        super(countOfLegs, canSwim, color);
        this.mustaches = mustaches;
    }
}
