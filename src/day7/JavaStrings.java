package day7;

import java.util.Arrays;

//    Strings
//    String name="John";
//    String name=new String("John");
//    equals()
public class JavaStrings {
    public static void main(String[] args) {

        String s="welcome";

        //length of the string
        System.out.println(s.length());

        //concat() -joining strings
        String s1="welcome ";
        String s2="marcin";
        System.out.println(s1.concat(s2));

        //trim() -remove right and left side spaces
        String s3="    great   ";
        System.out.println(s3);
        System.out.println(s3.trim());

        //charAt() -returns a single char based on index we passed
        String s4="welcome$";
        System.out.println(s4.charAt(0));
        System.out.println(s4.charAt(7));

        //contains() -returns bolean true/false
        System.out.println(s4.contains("wel"));
        System.out.println(s4.contains("$"));
        System.out.println(s4.contains("0"));

        //equals() , equalsIgnoreCase() -compare 2 strings, returns true/false
        String s5 = "WelcomE";
        String s6 = "welcome";
        System.out.println(s5.equals(s6));
        System.out.println(s5.equalsIgnoreCase(s6));

        //replace() - replace single or multiple characters in the string
        s="welcome to java selenium automation testing course for java";
        System.out.println(s.replace('e', '$'));
        System.out.println(s.replace("java","coffee"));

        //substring() -to extract substring from main string; NOTE that indexing for start is from 0 BUT indexing for end is from 1 !!
        s="Welcome";
        System.out.println(s.substring(3,7)); //for start c is index 3 but for end index of e is 7

        //split() -divide the string into multiple parts using delimeter; output is stored in array with multiple division !!
        s="abc@gmail.com";
        s2="abc,gsdd,seest";
        s3="uikf.X%";
        System.out.println(Arrays.toString(s.split("@")));
        String[] s2Array=s2.split(",");
        for(String x:s2Array){
            System.out.println(x);
        }
        String[]s3Array = s3.split("\\."); //need to use double backslashes \\ before . as dot is special char used in regular expressions (same for operators etc.)
        System.out.println(s3Array[0]);
        System.out.println(s3Array[1]);

        //toUpperCase(), toLowerCase()
        s="SDSAFsdsafDSF";
        System.out.println(s.toLowerCase());
        s2="dsffsadsaDSAFSA";
        System.out.println(s2.toUpperCase());

        //== vs. equals()
        //case1
        //below there is 1 object created with value "welcome" and both variables are pointing to its location
        String s7 = "welcome";
        String s8 = "welcome";
        System.out.println(s7==s8); //true because they point to the same object location
        System.out.println(s7.equals(s8));
        //case2
        //below there are 2 objects created, both with value "welcome" in them and each variable points to its own object
        String s9 = new String("welcome");
        String s10 = new String("welcome");
        System.out.println(s9==s10); //false because of different objetcs' locations
        System.out.println(s9.equals(s10));
        // == will compare objects
        // equals() will compare value of the objects





    }


}
