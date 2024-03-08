package day5;

import java.util.Scanner;

//        2) Palindrome number
//        input 121
//        after reversing 121
public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number to check if it palindrome or not: ");
        int number=scanner.nextInt();

        StringBuffer stringBuffer=new StringBuffer(String.valueOf(number));
        int reversedNumber=Integer.parseInt(stringBuffer.reverse().toString());
        if (reversedNumber==number){
            System.out.println("The number is palindrome");
        }else {
            System.out.println("The number is NOT palindrome");
        }
    }
}
