package day11;

public class Animal {

    String color = "white";
    void eat(){
        System.out.println("Eating..");
    }
}

class Dog extends Animal{
    String color = "black";
    void eat(){
        System.out.println("Eating meat..");
    }
    void displayColor(){
        System.out.println("Color is " + super.color); //"super" keyword takes value from immediate(means first above in levels) parent class, whilst "this" takes it from current class
    }
}
