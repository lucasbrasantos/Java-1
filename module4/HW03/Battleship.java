package module4.HW03;

import java.util.Scanner;

public class Battleship {
    

    public static void main(String[] args) {
        
        
        System.out.println();
        System.out.println("===============");
        System.out.println("-- BATTLESHIP --");
        System.out.println("===============");
        System.out.println();
        System.out.println("Welcome to Battleship!");
        System.out.println();

        int col = 5;
        int row = 5;
        String bgChar = "*";
        String hitShip = "X";
        String firedBg = "O";

        String[][] grid = new String[col][row];

        System.out.println("     -- exemplo --");
        System.out.println();

        int k = 5;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = bgChar; // make every grid [] with * characher
                if (j == 0) {                    
                    System.out.print("  " + (k) + " - ");
                    k--;
                }
                System.out.printf("%s  ", grid[i][j]); // draw map E
            }
            if (i == 4) {
                System.out.printf("\n      A  B  C  D  E"); // draw map 
            }  
            System.out.println();
        }
        System.out.println("\n");

        
        // drawMap(5, 5, "*");

        
        String p1_pos[] = new String[5];
        String p2_pos[] = new String[5];

        Scanner input = new Scanner(System.in);

        System.out.println("Player A");
        System.out.println("Insert 5 coordinates");
        for (int i = 0; i < p1_pos.length; i++) {
            System.out.printf("%dº: ", (i+1));
            p1_pos[i] = input.nextLine().toUpperCase();
        }

        ////
        System.out.println("Player B");
        System.out.println("Insert 5 coordinates");
        for (int i = 0; i < p2_pos.length; i++) {
            // System.out.printf("%dº: ", (i+1));
            // p2_pos[i] = input.nextLine().toUpperCase();
        }

        
        
        drawMap(col, row, bgChar, p1_pos, p2_pos);

    }

    public static void drawMap(int col, int row, String bgChar, String[] p1_pos, String[] p2_pos){
        
        String[][] grid = new String[col][row];
        String shipChar = "@";


        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = bgChar; // make every grid with * characher
            }
        }
        
        System.out.print("\n\n\n");
        
        /*
         * 0 
         * 1
         * 2
         * 3
         * 4
         *   A B C D E
         *  A1
         *  [COL][ROW]
         * 
        */
            
        for (String pos : p1_pos) {
            
            int rowPos = Character.getNumericValue(pos.charAt(1));
            rowPos = (rowPos == 5) ? 0 :
                (rowPos == 4) ? 1 :
                (rowPos == 3) ? 2 :
                (rowPos == 2) ? 3 :
                (rowPos == 1) ? 4 : 0; 

            int colPos = pos.charAt(0);
            colPos = (colPos == 'A') ? 0 :
                (colPos == 'B') ? 1 :
                (colPos == 'C') ? 2 :
                (colPos == 'D') ? 3 :
                (colPos == 'E') ? 4 : 0;

            grid[rowPos][colPos] = shipChar;

        }

        for(int k = 0; k < 2; k++){

            int c = 5;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                   
                    if (j == 0) {                    
                        System.out.print("  " + (c) + " - ");
                        c--;
                    }
                    
                    System.out.printf("%s  ", grid[i][j]); // draw map
                }
                if (i == 4) {
                    System.out.printf("\n      A  B  C  D  E"); // draw map 
                }  
                System.out.println();
            }

            if (k == 0) {
                
                System.out.println();
                System.out.println("||===================||");
                System.out.println();
            }

        }

    }
}

