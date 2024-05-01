package module2.lesson5;


public class FormattedPrint {


    public static void main(String[] args) {
        

        // - NORMAL PRINT
        System.out.println("Hello World! with"); 
        System.out.print("Hello World!");

        System.out.println("\n\n");
        
        // -- PRINTF 
        //Type      	                Character
        //Decimal (all integers)            d
        //Floating Point (float, double)	f
        //String	                        s
        
        // - FORMATTED PRINT
        String s1 = "!";
        System.out.printf("Hello World%s\n", s1);
        
        
        String h1 = "Hello";
        String h2 = "World!";
        System.out.printf("%s %s \n\n", h1, h2);


        // - FORMATTED FLOATS
        double PI = 3.14159;
        double bigNumber = 2822663.2932;
         
        System.out.printf("Pi is %f", PI);
        System.out.println();
        System.out.printf("Pi is %.2f\n\n", PI); // put "." in each 3 digits, each hundred
        
        System.out.printf("Unformatted big number:  %.2f\n", bigNumber);
        System.out.printf("Formated big number:     %,.2f", bigNumber);


        // - FORMATTED (STRINGS) padding
        String lemon = "lemon";
        String apple = "apple";
        String watermelon = "watermelon";
        String pineapple = "pineapple";
        
        // align right
        System.out.println();
        System.out.println();
        System.out.println("- SUPERMARKET - ITEMS -");
        System.out.printf("1: %10s\n", lemon);
        System.out.printf("2: %10s\n", apple);
        System.out.printf("3: %10s\n", watermelon);
        System.out.printf("4: %10s\n", pineapple);
        
        System.out.println(); // break line

        // align left
        System.out.printf("1: %-10s\n", lemon);
        System.out.printf("2: %-10s\n", apple);
        System.out.printf("3: %-10s\n", watermelon);
        System.out.printf("4: %-10s\n", pineapple);    

        

    }
}
