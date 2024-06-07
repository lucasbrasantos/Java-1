package module3.lesson7;

public class ContinueStatementExample {
    
    public static void main(String[] args) {
        // Using a for loop to print odd numbers from 1 to 10 excluding multiples of 3
        System.out.println("Printing odd numbers from 1 to 10 excluding multiples of 3 using a for loop with continue:");
        for (int i = 1; i <= 10; i++) {
            // Skip even numbers
            
            if (i % 2 == 0) {
                continue; // Skip to the next iteration of the loop
            }
            // Skip multiples of 3
            if (i % 3 == 0) {
                continue; // Skip to the next iteration of the loop
            }
            System.out.println(i);
        }
        
    }
}
