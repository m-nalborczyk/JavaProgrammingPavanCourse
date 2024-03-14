package day9;

public class MethodOverloadingMain {
    public static void main(String[] args) {

        MethodOverloading m1 = new MethodOverloading();
        m1.sum();
        m1.sum(1,2);
        m1.sum(1,2,5);
        m1.sum(2.5, 3);
        m1.sum(52, 3.5323);
    }
}
