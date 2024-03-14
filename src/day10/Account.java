package day10;

//Encapsulation
//wrapping up of data and methods into single unit(class).
//all variables should be private.
//we can access variables only through methods(setters & getters)

//Encapsulation in Java is a fundamental concept of object-oriented programming that involves bundling
//the data (attributes) and methods (behavior) that operate on the data into a single unit, called a class.
//It allows the internal state of an object to be hidden from outside access, and only allows access to the data
//through well-defined interfaces, typically public methods.

public class Account {

    private int accNumber;
    private String name;
    private double balance;


    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

