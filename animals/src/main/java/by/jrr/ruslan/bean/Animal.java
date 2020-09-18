package by.jrr.ruslan.bean;


public abstract class Animal {
protected  int countOfLegs;
private boolean canSwim;
private String color;

public String breath(){
    return "I can breath";
}

public String voice(){
    return "I say Hau-hau";
}


    public Animal(int countOfLegs, boolean canSwim, String color) {
        this.countOfLegs = countOfLegs;
        this.canSwim = canSwim;
        this.color = color;
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "countOfLegs=" + countOfLegs +
                ", canSwim=" + canSwim +
                ", color='" + color + '\'' +
                '}';
    }
}
