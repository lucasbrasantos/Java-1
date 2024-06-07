package module4.HW03;

import java.util.Scanner;

public class Battleship {

    private String[][] grid1;
    private String[][] grid2;

    static final String shipChar = "@";
    static final String bgChar = "*";
    static final String hitShip = "X";
    static final String firedBg = "O";

    static final Scanner input = new Scanner(System.in);

    public Battleship(int row, int col){
        this.grid1 = new String[row][col];
        this.grid2 = new String[row][col];
    }

    public static void main(String[] args) {
                
        System.out.println();
        System.out.println("===============");
        System.out.println("-- BATTLESHIP --");
        System.out.println("===============");
        System.out.println();
        System.out.println("Welcome to Battleship!");
        printExample();

        Battleship game = new Battleship(5, 5);

        /* GET PLAYER POSITIONS */
        String p1_pos[] = getPlayerPositions("Player 1");
        String p2_pos[] = getPlayerPositions("Player 2");

        /* PLACE SHIPS */
        game.placeShips(p1_pos, p2_pos);
        
        printGrid(game.grid1);
        System.out.println();
        printGrid(game.grid2);
        
        /* LOOP DO JOGO */

        boolean victory = false;

        while (!victory) {
            
            switch (game.playerAtack()) {
                case 0:
                    
                    break;
                case 1:
                    
                    break;
                case 2:
                    
                    break;
            
                default:
                    break;
            }

        }
                
    }

    private byte playerAtack(){
        System.out.printf("--> Insert your atack, ex: (a2)\n");
        
        String atk_pos = input.nextLine();

        int pos[] = getGridPosition(atk_pos);
        


        return result;
    }

    public static String[] getPlayerPositions(String playername){
        String[] positions = new String[5];

        System.out.printf("(%s) - Insert 5 coordinates:\n", playername);
        for (int i = 0; i < positions.length; i++) {
            System.out.printf(" -=- %dº: ", (i+1));
            positions[i] = input.nextLine().toUpperCase();
        }        
        return positions;
    }

    public void placeShips(String[] p1_pos, String[] p2_pos){
        fillGrid(grid1);
        fillGrid(grid2);
        //
        placePlayerShips(grid1, p1_pos);
        placePlayerShips(grid2, p2_pos);
    }

    private void placePlayerShips(String[][] grid, String[] positions){   
            
        for (String e : positions) {
            
            int pos[] =  getGridPosition(e);
            
            // pos[0] = rows
            // pos[1] = cols

            grid[pos[0]][pos[1]] = shipChar;
        }

    }

    private int[] getGridPosition(String position){
        int rowPos = Character.getNumericValue(position.charAt(1));
        rowPos = (rowPos == 5) ? 0 :
            (rowPos == 4) ? 1 :
            (rowPos == 3) ? 2 :
            (rowPos == 2) ? 3 :
            (rowPos == 1) ? 4 : 0; 

        int colPos = position.charAt(0);
        colPos = (colPos == 'A') ? 0 :
            (colPos == 'B') ? 1 :
            (colPos == 'C') ? 2 :
            (colPos == 'D') ? 3 :
            (colPos == 'E') ? 4 : 0;

        int result[] = {rowPos, colPos};
        return result;
    }

    private void fillGrid(String[][] grid){

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = bgChar; // make every grid with * character
            }
        }
    }

    public static void printGrid(String[][] grid){  
        /*
         * 0 · · · · ·
         * 1 · · · · ·
         * 2 · · · · ·
         * 3 · · · · ·
         * 4 · · · · ·
         *   A B C D E
         *  
         *  [COL][ROW]
         * 
        */

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

    }

    public static void printExample(){
        System.out.println("\n\n    -- exemplo --\n");

        int k = 5;
        int grid_XLength = 5;
        int grid_YLength = 5;
        
        for (int i = 0; i < grid_XLength; i++) {
            for (int j = 0; j < grid_YLength; j++) {
                if (j == 0) {                    
                    System.out.print("  " + (k) + " - ");
                    k--;
                }
                System.out.printf("%s  ", bgChar);
            }
            if (i == 4) {
                System.out.printf("\n      A  B  C  D  E"); // draw map 
            }  
            System.out.println();
        }
        System.out.println("\n");
    }

}

