package day11;

//4) Multiple       >multiple parents have the same child, 1 child has multiple parents
//                  >IMPORTANT: multiple inheritance is not supported with classes > it has to use interfaces concept
//                  >class cannot extend from multiple other classes, just one !
class Abc {
    Integer a=234;
}
class Xyz{
    Integer b=345;

}
//class Mno extends Abc, Xyz { //cannot extend multiple classes error because of below reason
//
//}

public class MultipleInheritance {
    public static void main(String[] args) {
        //even though Abc and Xyz classes don't have the same variables or methods created manually
        //they still have predefined methods available once class is created as below method .toString()
        //because all classes by default extend root class Object (that .toString() belongs)
        Abc abc = new Abc();
        Xyz xyz = new Xyz();
        abc.a.toString();
        xyz.b.toString();

    }
}
