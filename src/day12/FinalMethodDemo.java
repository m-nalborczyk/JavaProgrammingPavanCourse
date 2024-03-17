package day12;
//final:

////Variables - we cannot change the value of variable ( constant)
////methods - we cannot override methods in the child class
////classes - we cannot extend the class in to another class
class Test1{
    final void m(){
        System.out.println("This is Test1 class method");
    }
}
class Test2 extends Test1{
//    void m(){                                             >cannot be overridden as method m in parent class is as final
//        System.out.println("This is Test2 class method");
//    }
}

public class FinalMethodDemo {
    public static void main(String[] args) {

    }
}
