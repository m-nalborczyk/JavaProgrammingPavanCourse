package day5;

import java.util.Scanner;

//3) Count Number of Digits in a Number
//Input : 423424
//output : 6
public class CountNumberOfDigits {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number to see how many digits it have:");
        int number=scanner.nextInt();
        int count=0;
        while (number>0){
            number=number/10;
            count++;
        }
        System.out.println("the number has "+count+" digits.");
    }

}
