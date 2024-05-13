package module3.lesson7;

public class BreakStatementExample {
    
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        // Using a for loop to find the first even number in the array
        System.out.println("Finding the first even number using a for loop with break:");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println("First even number found: " + number);
                break; // Exit the loop once the first even number is found
            }
        }
        
        // Using a while loop to find the first odd number greater than 5
        System.out.println("\nFinding the first odd number greater than 5 using a while loop with break:");
        int i = 5;
        while (i < numbers.length) {
            if (numbers[i] % 2 != 0) {
                System.out.println("First odd number greater than 5 found: " + numbers[i]);
                break; // Exit the loop once the first odd number greater than 5 is found
            }
            i++;
        }
    }
}
