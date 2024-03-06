package day5;

public class LoopingStatements {
    public static void main(String[]args) {

//Looping statements/Iterative statements
//------------
//while loop
//do while  loop
//for loop
//Enhanced for loop/ for each loop - arrays & collections

//        while loop
//                ---------------
//        while(condition)
//        {
//            statements;
//            inc/dec;
//        }
//
//
//        do...while
//        ----------------
//        do
//        {
//            statements;
//            inc/dec;
//        }while(condition);
//
//
//
//        for loop
//                ----------
//        for(initilization; condition; inc/dec )
//        {
//            statements;
//        }
        //print even numbers between 1-10
        int i=1;
        while(i<=10){
            if (i%2==0){
                System.out.println(i);
            }
            i++;
        }

        int y=10; //in do while loop the statements are run at least once
        do{
            System.out.println(y);
            y++;
        }while (y<=5);

        System.out.println("for loop 0-10");
        for (int iterator=0; iterator<=10; iterator++){
            System.out.println(iterator);
        }






    }
}
