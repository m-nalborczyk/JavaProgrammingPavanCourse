package day2;

public class DataTypesDemo2 {

    public static void main(String[] args) {
        //numeric:
        int a=100, b=200;
        System.out.println("the value of a is " +a);
        System.out.println("the value of b is " +b);

        long x=1245212462454212421L;
        System.out.println(x);

        byte y=-100;

        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        //decimal:
        float item_price=15.234F;
        double item2_price=2.423225234;

        //character
        char letter='A';
        char sign='$';

        //true false
        boolean isTrue = true;
        boolean isFalse = 1>2;
        System.out.println(isFalse);

    }
}
