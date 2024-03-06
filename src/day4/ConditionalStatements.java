package day4;

public class ConditionalStatements {
    public static void main(String[] args) {

//        Conditional statements
//        ----------------
//        1) if
//        2) else if
//        3) nested if else
//        4) switch case


        int person_age=12;

        //if
        if (person_age>18){
            System.out.println("Eligible for vote");
        }

        //if else
        if (person_age>18){
            System.out.println("You can purchase drink alcohol");
        }
        else {
            System.out.println("You cannot purchase alcohol");
        }

        int num=11;
        if (num%2==0){
            System.out.println("number is even");
        }
        else {
            System.out.println("number is odd");
        }

        //else if
        int num2=-2;
        if(num2>0){
            System.out.println("number is positive");
        }
        else if(num2==0){
            System.out.println("number is equal to 0");
        }
        else {
            System.out.println("number is negative");
        }

        //nested if else - if outer if block is true then it goes into inner if block
        if(true){
            if(true){
                System.out.println(123);
            }
            else {
                System.out.println(321);
            }
        }
        else {
            System.out.println("xyz");
        }

        //switch case for multiple conditions
        int week_num=4;

        switch (week_num){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid week number, provide 1-7");
        }

    }

}
