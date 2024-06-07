package module2.HW01;

public class PrimitiveOperations {
    

    public static void main(String[] args) {
        
        int v1 = 28;
        double v2 = 3.14159;
        
        System.out.println(v1);
        System.out.println(v2);

        double total = v1 * v2;
        System.out.println("v1 * v2 total: " + total);

        double newV1 = v1;
        int newV2 = (int)v2;
        System.out.println("v1 casting: " + newV1);
        System.out.println("v2 casting: " + newV2);


        char letter = 'J';
        int asciiValue = (int)letter + 32; // 74 (J ascii value) + 32 (difference) = 106 (j ascii value)
        
        char newLetter = (char)asciiValue;
        System.out.println("uppercase letter: " + letter);
        System.out.println("lowercase letter: " + newLetter);
        
    }
}