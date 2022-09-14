package com.company;

public class Cat extends Animal{
    public Cat(int food, String location,boolean sleep, String characteristics ){
        super(food, location, sleep, characteristics);
    }
    @Override
    public void makeNoise(){
        if(sleep = true)
        {
            System.out.println("Кошка спит");
        } else {
            System.out.println("Кошка не спит");
        }
    }

}
