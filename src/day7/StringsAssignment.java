package day7;

//1) Reverse a string
//s="abc"
//reverse string: cba

//2) Check string is palidrome or not
//madam
//madam  - palindrome

//3) Check string presence in array

//4) swap 2 strings
//x="john"
//y="david";

public class StringsAssignment {
    public static void main(String[] args) {

        //1) Reverse a string
        String s="abcdef$";
        String rev="";

        //1way with concatenation
        for (int i=0; i<s.length(); i++){
            rev=rev+(s.charAt(s.length()-1-i));
        }
        System.out.println(rev);

        //2way with char array
        String rev2="";
        char[] a = s.toCharArray();
        for(int i=0; i<a.length; i++){
            rev2=rev2+a[a.length-1-i];
        }
        System.out.println(rev);

        //3way with String Buffer class reverse method
        StringBuffer sb=new StringBuffer(s);
        System.out.println(sb.reverse());


        //_________________________________________________________
        //2) Check string is palidrome or not
        String word = "madam";
        StringBuffer sb2 = new StringBuffer(word);
        String reversedWord1=sb2.reverse().toString();

        if (word.equals(reversedWord1)){
            System.out.println("The word is the palindrome");
        }
        else {
            System.out.println("The word is NOT the palindrome");
        }

        //3) Check string presence in array
        String word2 = "Welcome in the java course";
        String searchedWord = "java";
        System.out.println(word2.contains(searchedWord));

        //4) swap 2 strings
        String x = "john";
        String y = "chris";
        String temp = x;
        System.out.println("Before swap x is "+x+" and y is " +y);
        x = y;
        y = temp;
        System.out.println("After swap x is "+x+" and y is " +y);





    }
}
