package day9;

public class Greetings {

    //1 no parameters no return value
    void greetingNoParamaNoReturnValue(){
        System.out.println("Hello!");
    }

    //2 no parameters with return value
    String greetingNoParamaWithReturnValue(){
        String msg = "Hello, how are you?";
        return msg; //or we could just use > return "Hello, how are you?";
    }

    //3 with parameters no return value
    void greetingWithParamNoReturnValue(String name){
        System.out.println("Hello " + name + ", how are you?");
    }

    //4 with parameters with return value
    String greetingWithParamWithReturnValue(String name){
        return "Hello " + name + ", how are you?";
    }


}
