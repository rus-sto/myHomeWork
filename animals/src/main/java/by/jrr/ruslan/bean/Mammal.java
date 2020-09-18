package by.jrr.ruslan.bean;

public abstract class Mammal extends Animal{

    private boolean mustaches;
    public String run(){
        return "running fast";
    }

    public boolean isMustaches() {
        return mustaches;
    }

    public void setMustaches(boolean mustaches) {
        this.mustaches = mustaches;
    }

    public Mammal(int countOfLegs, boolean canSwim, String color, boolean mustaches) {
        super(countOfLegs, canSwim, color);
        this.mustaches = mustaches;
    }
}
