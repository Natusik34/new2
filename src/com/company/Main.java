package com.company;

public class Main {

    public static void main(String[] args) {
	Animal[] animals = new Animal[3];
	animals[0] = new Cat(10,"Дом", false, "Боится воды");
	animals[1] = new Dog(6, "Дом", true, "Поддается дрессеровке");
	animals[2] = new Horse(17, "Поле", true, "Можно оседлать");

	Veterinarion.treatAnimal(animals[0]);
	Veterinarion.treatAnimal(animals[1]);
	Veterinarion.treatAnimal(animals[2]);
    }
}
