package test13extra;
//import is done whenever we want to use class that is not in the same package
import day13.AccessModifiers;//                     as AccessModifiers class is in different package we have to import it to create object of that class

public class AccessModifiersMain extends AccessModifiers{

    public static void main(String[] args) {

        AccessModifiers obj = new AccessModifiers();
        //below examples from methods - the same behavior for variables
        //obj.m1();                                 cannot access as it is default and is in different package
        //obj.m2();                                 cannot access as it is private
        //obj.m3();                                 cannot access as it is protected without inheritance due to different package
        AccessModifiersMain obj2 = new AccessModifiersMain();
        obj2.m3();//                                can access as it is protected with inheritance
        obj.m4();//                                 can access as it is public which means we can access everywhere
        obj2.m4();//                                can access as it is public which means we can access everywhere




    }

}
