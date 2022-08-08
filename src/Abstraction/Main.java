package Abstraction;

abstract class Animal{ //parent abstract class
    public abstract void animalType();
    public void end(){
        System.out.println("-------Next animal-------");
    }
}

class Mammal extends Animal{ //child class
    public void animalType() {
        System.out.println("This animal is a mammal.");
    }
}

class Reptile extends Animal{
    public void animalType() {
        System.out.println("This animal is a reptile.");
    }
}

class Bird extends Animal{
    public void animalType() {
        System.out.println("This animal is a bird.");
    }
}

public class Main {

    public static void main(String[] args) {
        Mammal mammal1 = new Mammal();
        mammal1.animalType();

        mammal1.end();

        Reptile reptile1 = new Reptile();
        reptile1.animalType();

        reptile1.end();

        Bird bird1 = new Bird();
        bird1.animalType();
    }
}
