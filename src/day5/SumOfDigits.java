package day5;

//5) Find sum of digits in a number
//input : 1234
//sum= 10
public class SumOfDigits {
    public static void main(String[] args) {
        int num=123455;
        int sum=0;

        while (num>0){
            sum=sum+num%10;
            num=num/10;
        }
        System.out.println("Sum of the digits in the number is: " + sum);
    }
}
