package module3.lesson6;

public class LogicalOperators {
    
    public static void main(String[] args) {
        
        // Logical AND (&&) operator
        boolean condition1 = true;
        boolean condition2 = false;
        
        // Example using Logical AND (&&) operator
        if (condition1 && condition2) {
            System.out.println("Both conditions are true.");
        } else {
            System.out.println("At least one condition is false.");
        }

        // Logical OR (||) operator
        int x = 5;
        int y = 10;
        
        // Example using Logical OR (||) operator
        if (x > 5 || y < 15) {
            System.out.println("At least one condition is true.");
        } else {
            System.out.println("Both conditions are false.");
        }

        // Logical NOT (!) operator
        boolean value = false;
        
        // Example using Logical NOT (!) operator
        if (!value) {
            System.out.println("Value is false.");
        } else {
            System.out.println("Value is true.");
        }

        // Bitwise AND (&) operator
        int a = 5; // binary: 0101
        int b = 3; // binary: 0011
        
        // Example using Bitwise AND (&) operator
        int resultAnd = a & b; // binary: 0001 (decimal: 1)
        System.out.println("Result of Bitwise AND: " + resultAnd);

        // Bitwise OR (|) operator
        int c = 5; // binary: 0101
        int d = 3; // binary: 0011
        
        // Example using Bitwise OR (|) operator
        int resultOr = c | d; // binary: 0111 (decimal: 7)
        System.out.println("Result of Bitwise OR: " + resultOr);

        // Bitwise XOR (^) operator
        int e = 5; // binary: 0101
        int f = 3; // binary: 0011
        
        // Example using Bitwise XOR (^) operator
        int resultXor = e ^ f; // binary: 0110 (decimal: 6)
        System.out.println("Result of Bitwise XOR: " + resultXor);

        // Bitwise complement (~) operator
        int number = 5; // binary: 0000 0000 0000 0000 0000 0000 0000 0101
        
        // Example using Bitwise complement (~) operator
        int resultComplement = ~number; // binary: 1111 1111 1111 1111 1111 1111 1111 1010 (decimal: -6)
        System.out.println("Result of Bitwise Complement: " + resultComplement);

    }
}
