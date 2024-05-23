package module4.lesson8;

public class Arrays2DProcessing {

    public static void main(String[] args) {

        double[][] numbers = {
            {66, 72, 18, 87},
            {46, 71, 47, 76},
            {17, 34, 77, 4},
            {13, 68, 12, 39},
        };

        double temp;
        boolean swapped;

        for (int row = 0; row < numbers.length; row++) {
            
            for (int col = 0; col < numbers[row].length - 1; col++) {
                swapped = false;

                for (int i = 0; i < numbers[row].length - 1 - col; i++) {
                    if (numbers[row][i] > numbers[row][i + 1]) {
                        temp = numbers[row][i];
                        numbers[row][i] = numbers[row][i + 1];
                        numbers[row][i + 1] = temp;
                        swapped = true;
                    }
                }

                if (!swapped) {
                    break;
                }
            }
        }

        // Print the sorted 2D array
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                
                System.out.printf("| %10.2f  |", numbers[row][col]);
            }
            System.out.println();
        }
    }
}
