package module3.lesson6;

import java.util.Scanner;

public class TernaryConditionalOperator {
    
    public static void main(String[] args) {
        
        // condition ? expression1 : expression2

        Scanner input = new Scanner(System.in);
        
        boolean raining;
        String rainInput;
        
        System.out.print("Is raining? (yes/no): ");
        rainInput = input.nextLine();


        if (rainInput.startsWith("y")) {
            raining = true;
        }
        else {
            raining = false;
        }
        //Here’s its one line equivalent using the ternary operator:

        raining = rainInput.startsWith("y") ? true : false;

        System.out.println(raining);


        ///////////////////

        int fahrenheit = 1;

        System.out.println(fahrenheit + " " + (
                (fahrenheit == 1) || (fahrenheit == -1) ? "degree" : "degrees"
            )
        );

    }
}
