public class M3CW2_molina {

    public static void main(String[] args) {

        // ====== INTEGER TYPES ======
        // byte: very small whole number (-128 to 127)
        byte myByte = 100;

        // short: larger than byte (-32,768 to 32,767)
        short myShort = 20000;

        // int: most common integer type (-2 billion to 2 billion)
        int myInt = 100000;

        // long: very large whole numbers (use L at the end)
        long myLong = 10000000000L;

        // ====== DECIMAL / FLOATING POINT TYPES ======
        // float: numbers with decimals, smaller precision (use f at the end)
        float myFloat = 3.14f;

        // double: numbers with decimals, higher precision (default type)
        double myDouble = 3.14159265359;

        // ====== CHARACTER AND BOOLEAN ======
        // char: single character (in single quotes)
        char myChar = 'A';

        // boolean: true or false values
        boolean myBoolean = true;

        // ====== REFERENCE TYPE ======
        // String: sequence of characters (words, sentences, etc.)
        String myString = "Hello, Java!";
        
        // ====== DISPLAY VALUES ======
        System.out.println("Byte Value: " + myByte);
        System.out.println("Short Value: " + myShort);
        System.out.println("Integer Value: " + myInt);
        System.out.println("Long Value: " + myLong);
        System.out.println("Float Value: " + myFloat);
        System.out.println("Double Value: " + myDouble);
        System.out.println("Character Value: " + myChar);
        System.out.println("Boolean Value: " + myBoolean);
        System.out.println("String Value: " + myString);
    }
}
