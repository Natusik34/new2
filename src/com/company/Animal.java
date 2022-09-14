package com.company;

public class Animal {
     int food;
     String location;
     String characteristics;
     boolean sleep;
    Animal(int food, String location, boolean sleep, String characteristics){
        this.food = food;
        this.location = location;
        this.sleep = sleep;
        this.characteristics = characteristics;
    }
    public void makeNoise(){
        if(sleep) {
            System.out.println("Сон");
        }    else{
                    System.out.println("Шум");
                }
            }
            public void eat(int countFood){
                this.food = countFood;
            }
            public void sleep(){
                this.sleep = true;
            }
            public int getFood(){
                return food;
            }
            public String getLocation(){
                return location;
            }
        }