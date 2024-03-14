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

//"this." keyword before variable always refer to class variable (not local one)

public class ConstructorOverloading {

    int x,y,z;
    double d;

    ConstructorOverloading(){
        x=10;
        y=20;
        d=1.5;
    }
    ConstructorOverloading(int x, int y){
        this.x=x;
        this.y=y;
    }
    ConstructorOverloading(int x, int y, double d){
        this.x=x;
        this.y=y;
        this.d=d;
    }
    ConstructorOverloading(int x, double d){
        this.x=x;
        this.d=d;
    }
    ConstructorOverloading(double d, int x){
        this.x=x;
        this.d=d;
    }

    void showData(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(d);
    }


}
