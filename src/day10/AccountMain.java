package day10;

public class AccountMain {

    public static void main(String[] args) {

        Account acc1= new Account();
        acc1.setAccNumber(234555223);
        acc1.setName("Savings");
        acc1.setBalance(500.50);

        System.out.println(acc1.getAccNumber());
        System.out.println(acc1.getName());
        System.out.println(acc1.getBalance());
    }

}
