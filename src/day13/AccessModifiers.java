package day13;

//Access modifiers
//public - we can access everywhere
//protected - we can access outside of the package but through inheritance
//default - only within the package
//private - only within the class
public class AccessModifiers {

    void m1(){
        System.out.println("this is m1 method with default access modifier");
    }
    private void m2(){
        System.out.println("this is m2 method with private access modifier");
    }
    protected void m3(){
        System.out.println("this is m3 method with protected access modifier");
    }
    public void m4(){
        System.out.println("this is m4 method with public access modifier");
    }
}
