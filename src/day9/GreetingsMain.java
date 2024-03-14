package day9;

public class GreetingsMain {

    public static void main(String[] args) {

        Greetings greet1 = new Greetings();
        greet1.greetingNoParamaNoReturnValue();

        Greetings greet2 = new Greetings();
        String msg = greet2.greetingNoParamaWithReturnValue();
        System.out.println(msg);

        Greetings greet3 = new Greetings();
        greet3.greetingWithParamNoReturnValue("Marcin");

        Greetings greet4 = new Greetings();
        String msg2 = greet4.greetingWithParamWithReturnValue("Tomek");
        System.out.println(msg2);

    }
}
