package module2.lesson3;

public class PrimitiveTypes {


    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        // -- Integer Based Values
        byte b = 127; // 8-bit
        short s = 32767; // 16-bit    
        int i = 2147483647; // 32-bit
        long l = 9223372036854775807L; // 64-bit

        // - Real Number Values (Floating Point Number)
        double d1 = 3.1415; //
        double d2 = 3141.5e-3; // same value as d1 but in scientific notation
        float f21 = 3.14f; //

        // ILLEGAL
        float f1 = (float) 3.14; //
        // LEGAL
        
        float f2 = 3.14F; // preferred casing
        float f3 = 3.14f; //

        // - Individual Characters
        char a = 'a'; // 'a', 'b', 'c'

        // char = '' single quotes
        // strings = "" double quotes

        char tab = '\t'; // -- ESCAPE SEQUENCES
        char newLine = '\n'; // -- ESCAPE SEQUENCES
        char carriageReturn = '\r'; // -- ESCAPE SEQUENCES
        char backslash = '\\'; // -- ESCAPE SEQUENCES
        char doubleQuote = '\"'; // -- ESCAPE SEQUENCES
        char singleQuote = '\''; // -- ESCAPE SEQUENCES
        
        // - Logic base Values
        boolean result = true; // 

        boolean parked = true;  //the car is parked
        boolean powered = false;  //the car is off

    }


    // TYPE        SIZE           RANGE
    // byte         8 bits       -128 to +127
    // short       16 bits      -32,768 to +32,767
    // int         32 bits      -2,147,483,648 to +2,147,483,647
    // long        64 bits      -9E18 to +9E18 (approximately)
    // float       32 bits      approximately -3.40282347E+38 to +3.40282347E+38 (or 6-7 digits of precision)
    // double      64 bits      approximately -1.79769313486231570E+308 to +1.79769313486231570E+308 (or 15-16 digits of precision)



}
