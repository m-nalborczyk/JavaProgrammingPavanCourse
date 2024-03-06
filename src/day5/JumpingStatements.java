package day5;

public class JumpingStatements {
    public static void main(String[] args) {

        //jumping statements - break , continue
        for (int i=1; i<=10;i++){
            if (i==7){
                break;
            }
            System.out.println(i);
        }

        for (int i=10; i>=1;i--){
            if (i==7 || i==5){
                continue; //it will jump back to the start of the loop, thus skip what is below which is outputting 5 and 7 in that condition
            }
            System.out.println(i);
        }
    }
}
