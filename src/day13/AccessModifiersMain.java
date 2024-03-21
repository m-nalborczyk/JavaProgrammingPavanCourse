package day13;

public class AccessModifiersMain {

    public static void main(String[] args) {

        AccessModifiers obj = new AccessModifiers();
        //below examples from methods - the same behavior for variables
        obj.m1();//                                 can access as it is default and is in the same package
        //obj.m2();                                 cannot access as it is private
        obj.m3();//                                 can access as it is protected and is in the same package
        obj.m4();//                                 can access as it is public which means we can access everywhere
    }

}
