package day11;

//Method Overriding:

//1) Possible only in  Multiple classes/inheritance.
//2) We should NOT change the definition of the method but body we should change.
//3) method names are same
//4) Related to inheritence

//Method Overloading
//1) Possible in Single & Multiple classes/inheritance
//2) We should change the definition of the method
//3) method names are same.
//4) Related to polymorphism

class A1{
    void m1(int a){
        System.out.println(a);
    }
    void m2(int b){
        System.out.println(b);
    }
}
class B1 extends A1{
    void m1(int a){ //overridden method
        System.out.println(a*a);
    }
    void m2(int b, int a){ //overloaded method
        System.out.println(a+b);
    }
}

public class OverridingVsOverloading {
    public static void main(String[] args) {
        B1 b1 = new B1();
        b1.m1(9);
        b1.m2(2);
        b1.m2(3,4);
    }
}
