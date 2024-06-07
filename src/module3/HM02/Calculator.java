package module3.HM02;

import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args) {
    
        System.out.println("      _                     ____      _            _       _             ");
        System.out.println("     | | __ ___   ____ _   / ___|__ _| | ___ _   _| | __ _| |_ ___  _ __ ");
        System.out.println("  _  | |/ _` \\ \\ / / _` | | |   / _` | |/ __| | | | |/ _` | __/ _ \\| '__|");
        System.out.println(" | |_| | (_| |\\ V / (_| | | |__| (_| | | (__| |_| | | (_| | || (_) | |   ");
        System.out.println("  \\___/ \\__,_| \\_/ \\__,_|  \\____\\__,_|_|\\___|\\__, |_|\\__,_|\\__\\___/|_|   ");
        System.out.println("=========================================================================");



        System.out.println("== OPERATIONS LIST ==");

        System.out.println("1 - add");
        System.out.println("2 - subtract");
        System.out.println("3 - multiply");
        System.out.println("4 - divide");
        System.out.println("5 - alphabetize");

        Scanner input = new Scanner(System.in);

        int calcOperation, n1, n2, result, result3;
        double d1, d2, result2;

        String t1, t2;

        try {
            System.out.print("-> Select one operation: ");
            calcOperation = input.nextInt();
        


            switch (calcOperation) {
                case 1:
                    
                    System.out.println("-- ADD OPERATION (+) --");
                    System.out.println("-- -- -- -- -- -- --");
                    System.out.println();
                    System.out.println("Insert 2 integers");
                    System.out.println();

                    try{
                        System.out.print("Integer 1: ");
                        n1 = input.nextInt();
                        
                        System.out.print("Integer 2: ");
                        n2 = input.nextInt();
                        
                        result = n1 + n2;
                        
                        System.out.printf("-- Result: %d", result);

                    } catch (Exception e) {
                        System.err.println("Invalid input entered. Terminating...");
                    }

                    break;
                case 2:
                        
                    System.out.println("-- SUBTRACT OPERATION (-) --");
                    System.out.println("-- -- -- -- -- -- --");
                    System.out.println();
                    System.out.println("Insert 2 integers");
                    System.out.println();

                    try{
                        System.out.print("Integer 1: ");
                        n1 = input.nextInt();
                        
                        System.out.print("Integer 2: ");
                        n2 = input.nextInt();
                        
                        result = n1 - n2;
                        
                        System.out.printf("-- Result: %d", result);

                    } catch (Exception e) {
                        System.err.println("Invalid input entered. Terminating...");
                    }

                    break;
                case 3:
                    
                    System.out.println("-- MULTIPLY OPERATION (*) --");
                    System.out.println("-- -- -- -- -- -- --");
                    System.out.println();
                    System.out.println("Insert 2 doubles");
                    System.out.println();

                    try{
                        System.out.print("Double 1: ");
                        d1 = input.nextDouble();
                        
                        System.out.print("Double 2: ");
                        d2 = input.nextDouble();
                        
                        result2 =  d1 * d2;
                        
                        System.out.printf("-- Result: %.2f", result2);

                    } catch (Exception e) {
                        System.err.println("Invalid input entered. Terminating...");
                    }

                    break;
                case 4:
                    
                    System.out.println("-- DIVIDE OPERATION (/) --");
                    System.out.println("-- -- -- -- -- -- --");
                    System.out.println();
                    System.out.println("Insert 2 doubles");
                    System.out.println();
                    
                    try {
                        
                        System.out.print("Double 1: ");
                        d1 = input.nextDouble();
                        
                        System.out.print("Double 2: ");
                        d2 = input.nextDouble();

                        result2 = (d1 / d2);
                        
                        System.out.printf("-- Result: %.2f", result2);

                    } catch (Exception e) {
                        System.err.println("Error: Please enter an integer.");
                    }

                    break;
                case 5:
                    
                    System.out.println("-- ALPHABETIZE OPERATION (a-z) --");
                    System.out.println("-- -- -- -- -- -- --");
                    System.out.println();
                    System.out.println("Insert 2 words");
                    System.out.println();

                    try {
                        
                        System.out.print("Word 1: ");                
                        t1 = input.next();
                        
                        System.out.print("Word 2: ");
                        t2 = input.next();
                        
                        result3 = t1.compareTo(t2);

                        if (result3 > 0) {
                            System.out.printf("-- Result: %s comes before %s", t1, t2);
                        }else{
                            
                            System.out.printf("-- Result: %s comes before %s", t2, t1);
                        }
                    
                    } catch (Exception e) {
                        System.err.println("Invalid input entered. Terminating...");
                    }

                    break;
                default:
                    System.err.println("Invalid input entered. Terminating...");
                    break;
            }

            input.close();
            
        } catch (Exception e) {
            
            input.close();
            System.err.println("Invalid input entered. Terminating...");
        }

    }
}
