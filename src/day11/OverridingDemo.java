package day11;

//Method Overriding:
//---------
//1) Possible only in  Multiple classes/inheritance.
//2) We should NOT change the definition of the method but body we should change.
//3) method names are same
//4) Related to inheritence

class Bank {
    double roi(){
        return 0.0;
    }
}
class MBank extends Bank{
    double roi(){
        return 7.5;
    }
}
class Santander extends Bank{
    double roi(){
        return 4.5;
    }
}

public class OverridingDemo {
    public static void main(String[] args) {
        MBank bank1 = new MBank();
        System.out.println(bank1.roi());

        Santander bank2 = new Santander();
        System.out.println(bank2.roi());

        Bank bank3 = new Bank();
        System.out.println(bank3.roi());
    }
}
