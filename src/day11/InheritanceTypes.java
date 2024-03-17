package day11;

//Inheritence
//Aquiring all the properties(Variables) & behaviour(methods) from one class to another class is called inheritance.
//types:
//1) Single         >2 classes A to B
//2) Multi level    >multiple classes inheriting from each other top to bottom A to B to C (C inherits from B & A)
//3) Hierarchy      >1 parent has multiple children (not connected to each other) creating hierarchy like family tree
//4) Multiple       >multiple parents have the same child, 1 child has multiple parents
//                  >IMPORTANT: multiple inheritance is not supported with classes > it has to use interfaces concept
//                  >class cannot extend from multiple other classes, just one !

class A{
    int a=100;
    void displayA(){
        System.out.println("Method from class A with variable value " +a);
    }
}

class B extends A{
    int b=50;
    void dislplayB(){
        System.out.println("Method from class B with variable value "+b);
    }
}

class C extends B{
    int c=300;
    void displayC(){
        System.out.println("Method from class C with variable value "+c);
    }
}

public class InheritanceTypes {

    public static void main(String[] args) {

        B b = new B();
        b.dislplayB();
        b.displayA();
        System.out.println("b is " + b.b + " and a is " + b.a);

        //direct access for modification of parent variables
        b.a = 200;
        b.b = 100;
        b.displayA();
        b.dislplayB();

        C c = new C();
        c.displayC();
        c.dislplayB();
        c.displayA();

    }

}
