package module2.lesson5;

import java.util.Scanner;

public class ScannerBasics{


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Fahrenheit value: ");
        int fahrenheit = input.nextInt();
        String day = input.nextLine();
        double celsius = (5d/9) * (fahrenheit - 32);
        

        System.out.println("\n\n\n");
        System.out.print(day + " : ");
        System.out.println("Celsius: " + celsius + " ºC | " + fahrenheit + " ºF");
        input.close(); //close input method
    }
}
