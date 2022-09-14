package com.company;

public class Horse extends Animal{
    public Horse(int food, String location, boolean sleep, String characteristics) {
        super(food, location, sleep, characteristics);
    }
            @Override
                    public void makeNoise(){
                if(sleep = true){
                    System.out.println("Лошадь спит");
                }else{
                    System.out.println("Лошадь не спит");
                }
        }
        }