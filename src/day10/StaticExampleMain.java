package day10;

import static day10.StaticExample.a;
import static day10.StaticExample.m1;


public class StaticExampleMain {


    public static void main(String[] args) {

        System.out.println(a); //directly accessing static variable without object creation BUT import static day10.StaticExample.a; above is required
        m1(); //directly accessing static method without object creation BUT import static day10.StaticExample.m1; above is required
        StaticExample.m3(); //directly accessing static method but without using "import static PATH.VARIABLE_NAME"
        //by directly we mean without creating object of the class StaticExample

        StaticExample se = new StaticExample(); //non-static method needs object creation
        se.m2(); //no import here required as object is created

        System.out.println(); // the same principle as for calling predefined methods within different classes to static variable as below > StaticExample.word.length()
        System.out.println(StaticExample.word.length());
        //"System" is class
        //"out" is static variable of PrintStream type in System class
        //"println() is one of predefined methods for PrintStream class



    }
}
