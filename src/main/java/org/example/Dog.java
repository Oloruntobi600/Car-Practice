package org.example;

public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tails;
    private int teeth;
    private String coat;
    public Dog(String name , int size, int weight, int eyes, int legs, int tails, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this. eyes = eyes;
        this. legs = legs;
        this . tails = tails;
        this . teeth = teeth;
        this . coat = coat;
    }
    private void chew(){
        System.out.println("Dog. chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog. eat() called");
        chew();
        super.eat();
    }
    void walk(){
        System.out.println("Dog. walk() called");
        move(5);
    }
    private void run(){
        System.out.println("Dog. run() called");
        move(10);
    }

}
