package day9;

public class ConstructorOverloadingMain {
    public static void main(String[] args) {

        ConstructorOverloading c1 = new ConstructorOverloading();
        c1.showData();

        ConstructorOverloading c2 = new ConstructorOverloading(2456, 2);
        c2.showData();

        ConstructorOverloading c3 = new ConstructorOverloading(1.5, 345);
        c3.showData();

        ConstructorOverloading c4 = new ConstructorOverloading(123, 566677, 0.5);
        c4.showData();
    }
}
