package day9;

public class ConstructorDemo {

    int x,y;
    String s;
    ConstructorDemo() //default constructor (can be with initialization as below or can be empty)
    {
        x=100;
        y=200;
        s="welcome";
    }

    ConstructorDemo(int x, int y, String s){ //parameterized constructor (can be used instead of default one)
        this.x = x;
        this.y = y;
        this.s = s;
    }

    void displayData(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(s);
    }
}
