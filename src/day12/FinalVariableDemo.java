package day12;

//final:

////Variables - we cannot change the value of variable ( constant)
////methods - we cannot override methods in the child class
////classes - we cannot extend the class in to another class
class Test {
    final int x =100; //constant value - we cannot change it
}

public class FinalVariableDemo {


    public static void main(String[] args) {


        Test test = new Test();
        //test.x=200;               >error because you cannot change final value
        System.out.println(test.x);
    }
}
