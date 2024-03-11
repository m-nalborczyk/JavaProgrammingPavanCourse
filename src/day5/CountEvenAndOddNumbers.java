package day5;

//4) count Number of Even and Odd digits in a Number
//Input: 23456
//Output : 3 even  2 odd
public class CountEvenAndOddNumbers {
    public static void main(String[] args) {
        int num=123444;

        int even_count=0;
        int odd_count=0;

        while (num>0){
            int rem=num%10;
            if (rem%2==0){
                even_count++;
            }
            else {
                odd_count++;
            }
            num=num/10;
        }
        System.out.println("Number of odd numbers: " + odd_count);
        System.out.println("Number of even number numbers: " +even_count);
    }

}
