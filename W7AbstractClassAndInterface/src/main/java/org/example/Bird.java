package org.example;

/**
 * Bird class extends Animal
 */
public abstract class Bird extends Animal {

    protected double wingSpan;
    //protected boolean canFly;
    protected double flySpeed;


    public Bird(String name, int age, double weight, String color,
                double wingSpan, boolean canFly, double flySpeed) {

        super(name, age, weight, color);

        this.wingSpan = wingSpan;
        //this.canFly = canFly;
        this.flySpeed = flySpeed;
    }

//    public void fly() {
//        if (canFly)
//            System.out.println(name + " is flying at speed " + flySpeed);
//        else
//            System.out.println(name + " cannot fly.");
//    }

    public void layEggs() {
        System.out.println(name + " lays eggs.");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Wing Span: " + wingSpan);
        //System.out.println("Can Fly: " + canFly);
        System.out.println("Fly Speed: " + flySpeed);
    }
}