package day10;

import static day10.StaticExample.a;
import static day10.StaticExample.m1;


public class StaticExampleMain {


    public static void main(String[] args) {

        System.out.println(a); //directly accessing static variable without object creation
        m1(); //directly accessing static method without object creation
        StaticExample.m3(); //directly accessing static method but without using "import static PATH.VARIABLE_NAME"

        StaticExample se = new StaticExample(); //non-static method needs object creation
        se.m2();

        System.out.println(); // the same principle as for calling predefined  methods within different classes to static variable as below > StaticExample.word.length()
        System.out.println(StaticExample.word.length());
        //"System" is class
        //"out" is static variable of PrintStream type
        //"println() is one of predefined methods for PrintStream class



    }
}
