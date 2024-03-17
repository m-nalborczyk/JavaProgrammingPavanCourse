package day11;

//super
//1) super keywork invokes immediate parent class variable
//2) super keyword invokes immediate parent class method

public class SuperKeywordTest {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        System.out.println(dog1.color); //this is from Dog class variable which was overridden
        dog1.displayColor(); //this is from super keyword used in Dog class method
    }
}
