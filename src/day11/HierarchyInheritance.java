package day11;
//3) Hierarchy      >1 parent has multiple children (not connected to each other) creating hierarchy like family tree

class Parent {
    void displayParent(int parent){
        System.out.println("Message from Parent and value "+parent);
    }
}

class ChildA extends Parent{
    void displayChildA(int a){
        System.out.println("Message from ChildA and value "+a);
    }
}
class ChildB extends Parent {
    void displayChildB(int b){
        System.out.println("Message from B and value "+b);
    }
}

public class HierarchyInheritance {

    public static void main(String[] args) {


        ChildB cb = new ChildB();
        cb.displayParent(500); //no access to displayA as there is no inheritance between them other than having the same parent

    }
}
