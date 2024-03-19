package day12;

interface Xyz{
    int xyz = 200;
    void m1();
}
interface Abc{
    int abc = 300;
    void m2();
    }

//this is how we can achieve multiple inheritance - by implementing multiple interfaces (as we cannot extend more than 1 clas)
//but we can extend only 1 class and at the same time implement n number of interfaces > extends must be first, implements after
//eg. public class MultipleInheritanceFromInterfaces extends Gho implements Xyz, Abc {} > Gho would be class and Xyz and Abc interfaces
public class MultipleInheritanceFromInterfaces implements Xyz, Abc{

    @Override
    public void m1() {
        System.out.println("this is m1 from Xyz interface");
        System.out.println(xyz);
    }

    @Override
    public void m2() {
        System.out.println("this is m2 from Abc interface");
        System.out.println(abc);
    }

    public static void main(String[] args) {
        MultipleInheritanceFromInterfaces obj = new MultipleInheritanceFromInterfaces();
        obj.m1();
        obj.m2();
    }
}
