package day9;

public class ConstructorDemoMain {

    public static void main(String[] args) {

        //invoking default constructor
        ConstructorDemo c1 = new ConstructorDemo();
        c1.displayData();

        //invoking parameterized constructor - default initialization does NOT occur
        ConstructorDemo c2 = new ConstructorDemo(200, 500, "from constructor with param - not default one");
        c2.displayData();
    }
}
