package day9;

/*
Polymorphism

one thing can have many forms...
Shape - circle,  square, triangle, rectangle
water -  vapour, ice burg
polymorphism can achive using overloading concept..
*/

//Rules are applicable in overloading:
//1) Method names should be same
//2) number of parameters should be different
//3) Data type of parameters should be different
//4) Order of parameters should be different

public class MethodOverloading {



    int x,y,z;
    double d;

    void sum(){
        System.out.println("I am without parameters but have the same method name");
    }
    void sum(int a, int b){
        x=a;
        y=b;
        System.out.println(x+y);
    }
    void sum(int a, int b, int c){
        x=a;
        y=b;
        z=c;
        System.out.println(x+y+z);
    }
    void sum(int a, double b){ //also 2 parameters but 2nd is different type
        x=a;
        d=b;
        System.out.println(x+d);
    }
    void sum(double b, int a){ //different order rule
        x=a;
        d=b;
        System.out.println(x+d);
    }

}
