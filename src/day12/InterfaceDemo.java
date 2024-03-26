package day12;

//Interface

//Abstraction is a process of hiding the implementation details
//and showing only functionality to the user.

//-------------
//An interface is a blueprint of class.
//Interface contains final & Static variables.
//Interface contains abstract methods.( also allowed default methods & Static methods from java8 onwards)
//An abstract method is a method contains definition but not body(Un-implemented method).
//Methods in interface are public, except with default.
//Interface supports the functionality of multiple inheritance.
//We can define interface with interface keyword.
//A class extends another class, an interface extends another interface but class implements an interface.
//We can create Object reference for Interface but we cannot instantiate interface.

interface Shape{
    int length = 10; //by default final & static [in italic]
    int width = 20;

    void circle(); //abstract method, means unimplemented method
    default void square(){ // default method - interface allows default and static methods but we have to add those keywords to them as interface considers methods as abstract
        System.out.println("this is square default method");
    }
    static void area(){ //static method
        System.out.println("this is area static method");
    }

}

public class InterfaceDemo implements Shape{

    public void circle(){ //                //in method implementation it is MANDATORY public as you cannot reduce the visibility from interface which is public
        System.out.println("this is circle");
    }                                       //first we need to implement abstract methods from interface
    public static void main(String[] args) {

        //Shape shape = new Shape(); incorrect as you cannot create object of Interface the way we access the members of Interface is by creating the object of the class that implements that interface
        InterfaceDemo interfaceDemo = new InterfaceDemo();
        Shape shape = new InterfaceDemo(); //however interface variable can hold object of class that implements it

        interfaceDemo.circle();
        interfaceDemo.square();
        Shape.area();                       //static method direct access without object

        shape.circle();
        shape.square();


    }
}
