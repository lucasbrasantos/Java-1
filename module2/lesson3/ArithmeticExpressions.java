package module2.lesson3;

public class ArithmeticExpressions {


    public static void main(String[] args) {
        
        // OPERATOR                 SYMBOL
        // Addition                   +
        // Subtraction                -
        // Multiplication             *
        // Division                   /
        // Remainder (or Modulus)     %


        // OPERATOR                 SYMBOL
        // Addition                   +
        int sum = 5 + 3;  // sum is 8
        
        // Subtraction                -
        int difference = 10 - 4;  // difference is 6
        
        // Multiplication             *
        int product = 6 * 2;  // product is 12
        
        // Division                   /
        double quotient = 15.0 / 4.0;  // quotient is 3.75
        
        // Remainder (or Modulus)     %
        int remainder = 17 % 5;  // remainder is 2    17/5 is 15 integer and the remainder is 2
        
        // Displaying results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        System.out.println("\n\n");

        // - STRING ARITHMETIC

        // "13" + "31" = "1331"

        // - INTEGER DIVISION

        /*
         
        1331 / 3 = 443 (not 443.6666666666667)
            9 / 2 = 4 (not 4.5)


            9.0 / 2 = 4.5
            9 / 2.0 = 4.5
            9.0 / 2.0 = 4.5
               or
            9D / 2 = 4.5
            9 / 2D = 4.5
            9D / 2D = 4.5


        */




        // - ASSIGNMENT CONVERSION
        // int average = 4;       JAVA creates a double type version the int and store in gpa location
        // double gpa = average; | 4.0   int to double

        // - ASSIGNMENT CONVERSION
        // double average = 4.0;      
        // int gpa = average; | compiler error "incompatible types: possible lossy conversion from double to int"



        //////// - CASTING


        int x = 4;
        int y = 6;
        int z = 12;

        double a = (double)z/x;
        double b = y;

        System.out.println(a + " " + b);


    }
}
