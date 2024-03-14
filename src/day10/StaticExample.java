package day10;

public class StaticExample {

//    static - > means we can access it without object creation
//-------
//1) static methods can access static variables & methods directly ( without object).
//2) static methods can access non-static stuff through object
//3) non-static methods can access everything directly.

    static  int a=10; //static variable
    static String word = "Welcome";
    int b=20; //non-static variable

    static void m1(){
        System.out.println("This is m1 static method");
    }
    static void m3(){
        System.out.println("This is without using \"import...\" at the top ");
    }

    void m2(){
        System.out.println("This is m2 non-static method");
    }




}
