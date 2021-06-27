package com.company;

public class cat {
    private int happyness;
    private int hunger;
    String color;

    public cat(String myColor){
        happyness=0;
        hunger = 5;
        color = myColor;
        System.out.println("new cat created");
    }
    private void purr(int loudness){
        System.out.println("purrrrr");
    }
    private void meow(){
        System.out.println("MEEEEEOOOOW");
    }
    public void feed(){
        if (hunger> 0){
            this.hunger --;
            purr(hunger);
            this.happyness ++;
            System.out.println("Cat has ben fed");
        }else if(hunger <=0){
            meow();
        }
    }
    public void pet(){
        purr(3);
        this.happyness ++;
        System.out.println("cat has ben pet");
    }
    public int getHappynes(){
        return this.happyness;
    }
    public int getHunger(){
        return this.hunger;
    }

}
