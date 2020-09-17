package by.jrr.ruslan.bean;

public abstract class Birds  extends Animal{

   public String beakColor;
   public String fly(){
       return "Yep, I'm flying";
   }

    public Birds(int countOfLegs, boolean canSwim, String color, String beakColor) {
        super(countOfLegs, canSwim, color);
        this.countOfLegs=2;
        this.beakColor = beakColor;
    }

    @Override
    public String voice() {
        return "kurly-kurly";
    }

}
