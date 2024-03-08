package day5;

import java.util.Scanner;

//1) Reverse a number (  %   / =   operators   )
//input 1234
//output 4321
public class ReverseNumber {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number to be reversed: ");

        int number=scanner.nextInt(); //1234 4321

        //1.Using algorithm
//        int rev=0;
//
//        while (number!=0){
//            rev=rev*10 + number%10;
//            number=number/10;
//        }
//        System.out.println("Reversed number is "+rev);

        //2.Using StringBuffer class
        StringBuffer sb=new StringBuffer(String.valueOf(number));
        StringBuffer rev=sb.reverse();

        System.out.println("Reversed number is "+rev);

    }
}
