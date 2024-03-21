package day13;

//Wrapper Classes
//-----------------
//The wrapper class in Java provides the mechanism to convert primitive into object and object into primitive.
//also it allows conversions from one object type to another eg. String to Integer and vice versa
//also practical for data conversion methods
public class WrapperClass {

    public static void main(String[] args) {

        //primitive variable doesn't provide any methods whereas object variable does
        int a =100;
        System.out.println(a);

        Integer z=200;
        System.out.println(z.doubleValue()); //example of methods from object

        //primitives
        byte b = 10;
        short s = 20;
        int i = 30;
        long l = 40;
        float f = 50.0F;
        double d = 60.0D;
        char c = 'a';
        boolean b2 = true;

        //converting primitives into objects : called Autoboxing !
        Byte byteobj=b;
        Short shortobj = s;
        Integer intobj = i;
        Long longobj = l;
        Float floatobj = f;
        Double doubleobj = d;
        Character charobj = c;
        Boolean boolobj = b2;
        System.out.println("Byte object: " + byteobj);
        System.out.println("Short object: " + shortobj);
        System.out.println("Integer object: " + intobj);
        System.out.println("Long object: " + longobj);
        System.out.println("Float object: " + floatobj);
        System.out.println("Double object: " + doubleobj);
        System.out.println("Character object: " + charobj);
        System.out.println("Boolean object: " + boolobj);

        //converting objects to primitives : Unboxing
        byte bytevalue=byteobj;
        short shortvalue = shortobj;
        int intvalue = intobj;
        long longvalue = longobj;
        float floatvalue = floatobj;
        double doublevalue = doubleobj;
        char charvalue = charobj;
        boolean boolvalue = boolobj;
        System.out.println("byte value: " + bytevalue);
        System.out.println("short value: " + shortvalue);
        System.out.println("int value: " + intvalue);
        System.out.println("long value: " + longvalue);
        System.out.println("float value: " + floatvalue);
        System.out.println("double value: " + doublevalue);
        System.out.println("char value: " + charvalue);
        System.out.println("boolean value: " + boolvalue);

        //Data Conversion methods:
        //String  ----> int         Integer.parseInt()
        //String -----> double      Double.parseDouble()
        //String ----> boolean	    Boolean.parseBoolean()

        //int ----> String          String.valueOf(data)
        //double--->String          String.valueOf(data)
        //booelan --->String        String.valueOf(data)
        //char---->String           String.valueOf(data)
        //String -->char            (not possible)


    }
}
