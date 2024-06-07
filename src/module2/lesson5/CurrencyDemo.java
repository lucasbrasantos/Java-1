package module2.lesson5;

import java.text.NumberFormat;
// import java.util.Locale; 
import java.util.Scanner;

public class CurrencyDemo {
    
    public static void main(String[] args) {
        

        int items;
        double itemCost, total;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of items: ");
        items = input.nextInt();

        System.out.print("Enter the cost per item: ");
        itemCost = input.nextDouble();
        
        total = items * itemCost;

        System.out.println("Unformated Total: " + total);

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        // NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE); if you want to include the local

        System.out.println("Formatted Total: " + currencyFormat.format(total));

        input.close(); //close input method
    }
}
