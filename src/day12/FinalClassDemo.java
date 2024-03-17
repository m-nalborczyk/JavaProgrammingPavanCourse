package day12;
//final:

////Variables - we cannot change the value of variable ( constant)
////methods - we cannot override methods in the child class
////classes - we cannot extend the class in to another class
final class Test3{ //final class cannot be inherited
     void m(){
        System.out.println("This is Test1 class method");
    }
}
//class Test4 extends Test3{                                >error as you cannot extend the class that is final
//    void m(){
//        System.out.println("This is Test2 class method");
//    }
//}
public class FinalClassDemo {
}
