package com.company;

public class animal {
    private int happyness;
    private int hunger;
    public String color;
        public animal(String myColor, String animalType){
            happyness=0;
            hunger = 5;
            color = myColor;
            System.out.println("new "+animalType " created");
    }
}
