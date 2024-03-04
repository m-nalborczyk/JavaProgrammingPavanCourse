package day3;

public class OperatorsDemo {
    public static void main(String[] args) {


//    Types of operators
//-----------------------
//        1) Arithmetic operators   + - * / %
//            2) Relational/comparison operators  >  >=  <  <=  !=  ==
//            3) Logical operators   &&   ||  !
//            4) Increment & Decrement operators  ++  --
//            5) Assignment   =   +=   -=   *= /=  %=
//            6) conditional/ternary operator  ?:
//
//
//            1) Unary operators      ++,  --  +=   -=   *= /=  %=  !     =
//            2) Binary operators    + - * / %   >  >=  <  <=  !=  ==  &&   ||
//            3) Ternary  operator  variable = expression ? result1 : result2;

        System.out.println((9%2)==1);
        System.out.println();

        System.out.println(1==1);
        System.out.println();

        boolean isTrue1 = true;
        boolean isTrue2 = true;
        boolean isFalse1 = false;
        boolean isFalse2 = false;
        System.out.println(isTrue1&&isTrue2);
        System.out.println(isFalse1&&isFalse2);
        System.out.println(isTrue1||isTrue2);
        System.out.println(isTrue1||isFalse1);
        System.out.println(isTrue1&&isFalse1);
        System.out.println();

        int a=10;
        System.out.println(a++); //post increment
        System.out.println(a);
        System.out.println(++a); //pre increment

//      3) Ternary  operator  variable = expression ? result1 : result2; > result1 for true and result2 for false depending on expression outcome
        int x=100, y=200;
        int z=x<y ? x:y;
        System.out.println(z);



    }
}
