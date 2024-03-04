package day3;

public class Swapping2Numbers {
    public static void main(String[] args) {
        int a=10, b=20;
        System.out.println("Before swapping values are "+a+" and " +b);

        //Logic1 - Third variable
//        int t=a;
//        a=b;
//        b=t;
//        System.out.println("After swapping values are "+a+" and " +b);

//        //Logic2 - use + and - without using third variable
//        a=a+b; //10+20=30
//        b=a-b; //30-20=10
//        a=a-b; //30-10=20
//        System.out.println("After swapping values are "+a+" and " +b);

//        //Logic3 - use * and / without using third variable - a and b should not be 0
//        a=a*b; //10*20=200
//        b=a/b; //200/20=10
//        a=a/b; //200/10=20
//        System.out.println("After swapping values are "+a+" and " +b);

        //Logic4 - single statement
        b=a+b-(a=b);
        System.out.println("After swapping values are "+a+" and " +b);
    }
}
