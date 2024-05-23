package module4.lesson8;

public class Arrays {
    
    public static void main(String[] args) {
        
        // Declaration of an array
        int[] intArray; // Declaring an array of integers
        String[] stringArray; // Declaring an array of strings
        

        // Initialization of an array
        intArray = new int[5]; // Allocating memory for 5 integers
        stringArray = new String[3]; // Allocating memory for 3 strings

        
        // Default values of an array
        System.out.println("Default values in intArray:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("intArray[" + i + "] = " + intArray[i]);
        }

        System.out.println("\nDefault values in stringArray:");
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println("stringArray[" + i + "] = " + stringArray[i]);
        }

        ////////////
        
        //this
        double[] weekHighs = {30, 32, 28, 29, 30};

        //or
        
        /*
            double[] weekHighs; //declaration
            weekHighs = {30, 32, 28, 29, 30}; //initialization
         */

        double sum = 0;

        for (int i=0; i < weekHighs.length; i++){
            
            sum+= weekHighs[i];
        }

        double weekAvarages = sum/(weekHighs.length);
        System.out.println("Medium temperature is: " + weekAvarages);

    }
}
