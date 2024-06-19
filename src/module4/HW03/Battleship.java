package module4.HW03;

import java.util.Scanner;

public class Battleship {

    private String[][] grid1;
    private String[][] grid2;

    static final String shipChar = "@";
    static final String bgChar = "*";
    static final String firedShip = "X";
    static final String firedBg = "O";

    

    static boolean victory = false;
    static boolean switchPlayer = false;
    // switchPlayer -> false = p1
    // switchPlayer -> true = p2

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

        pressEnterToContinue();

        Battleship game = new Battleship(5, 5);

        /* GET PLAYER POSITIONS */
        // String p1_pos[] = getPlayerPositions("Player 1");
        // String p2_pos[] = getPlayerPositions("Player 2");

        String ex_p1_pos[] = {"A1", "B2", "C3", "D4", "E5"};
        String ex_p2_pos[] = {"A1", "B2", "C3", "D4", "E5"};
        
        /* PLACE SHIPS */
        // game.placeShips(p1_pos, p2_pos);
        game.placeShips(ex_p1_pos, ex_p2_pos);
        

        while (!victory) {
            
            printBoard(game);
            int attackResult = game.playerAttack();


            switch (attackResult) {
                case 0:
                    System.out.println("\n ===================\nAlready hit that spot.\n ===================\n");
                    break;
                case 1:
                    System.out.println("\n===================\n  Oh, you missed!\n===================\n");
                    break;
                case 2:
                    System.out.println("\n===================\nOh, you hit a ship!\n===================\n");
                    break;
                case 3:
                    System.out.println("\n===================\n  Error in attack!\n===================\n");
                    break;
                case 4:
                    System.out.println("\n===================\n GAME OVER \n===================\n");
                    if (switchPlayer) {
                        System.out.println("\n==== PLAYER 2 WINS ====");
                    }else{
                        System.out.println("\n==== PLAYER 1 WINS ====");
                    }

                    pressEnterToContinue();
                    victory = true;
                    break;
                default:
                    System.out.println("\n===================\n  Error in attack!\n===================\n");
                    break;
            }

            if (victory) {
                break;
            }

            pressEnterToContinue();
            
            switchPlayer = !switchPlayer;
        }
                
    }

    public static void printBoard(Battleship game){        
        
        if (switchPlayer) { // true = p2 | false = p1
            System.out.printf("\n  =-= YOUR GRID =-=\n");
            printGrid(game.grid2);

            System.out.printf("\n =-= Oponent Grid =-=\n");
            printAtkGrid(game.grid1);
        }else{
            System.out.printf("\n  =-= YOUR GRID =-=\n");
            printGrid(game.grid1);

            System.out.printf("\n =-= Oponent Grid =-=\n");
            printAtkGrid(game.grid2);
        }
        System.out.print("------------------------\n"); 
    }

    private static void printAtkGrid(String grid[][]){

        
        int c = 5;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                
                if (j == 0) {                    
                    System.out.print("  " + (c) + " - ");
                    c--;
                }
                
                if (grid[i][j] == shipChar) {
                    System.out.printf("%s  ", bgChar);
                }else{
                    System.out.printf("%s  ", grid[i][j]);
                }
            }
            if (i == 4) {
                System.out.printf("\n      A  B  C  D  E"); // draw map 
            }  
            System.out.println();
        }

    }

    private int playerAttack(){ 
        if (!switchPlayer) {
            System.out.printf("-- PLAYER 1 --");
        }else{
            System.out.printf("-- PLAYER 2 --");
        }
        System.out.printf("--> Insert your atack, ex: (a2)\n");        
        String atk_pos = input.nextLine().toUpperCase(); // input for atk_pos

        atk_pos = validateInput(atk_pos);

        int pos[] = getGridPosition(atk_pos);
        // System.out.println("your atack is: "+Arrays.toString(pos));
        String[][] atkGrid = switchPlayer ? grid1 : grid2;
        

        if (pos[0] == -1 && pos[1] == -1) { // if error            
            return 3;
        }

        switch (atkGrid[pos[0]][pos[1]]) {
            case bgChar: // hit background
                atkGrid[pos[0]][pos[1]] = firedBg;
                return 1; // Miss
            case shipChar: // hit ship
                atkGrid[pos[0]][pos[1]] = firedShip;                
                
                if (checkGameOver(atkGrid)) {
                    return 4; // Game Over
                }

                return 2; // Hit
                
            case firedBg: // already hit background
            case firedShip: // already hit ship
                return 0; // Already hit
            default:
                return -1; // Invalid
        }
    }

    private boolean checkGameOver(String[][] grid){

        for (String[] row : grid) {
            
            for (String col : row) {
                if (col.equals(shipChar)) {
                    return false; // is not endgame
                }
            }
        }
        return true;
    }

    private static String validateInput(String atk_pos) {
        if (atk_pos.length() != 2) {
            return "ERROR";
        }

        char col = atk_pos.charAt(0);
        char row = atk_pos.charAt(1);

        if (col < 'A' || col > 'E') {
            return "ERROR";
        }

        if (row < '1' || row > '5') {
            return "ERROR";
        }

        return atk_pos;
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
            
            int pos[] = getGridPosition(e);            
            
            // pos[0] = rows
            // pos[1] = cols

            grid[pos[0]][pos[1]] = shipChar;
        }

    }

    private int[] getGridPosition(String position){
        position = position.toUpperCase();

        if (position == "ERROR") {

            int[] rtn = {-1, -1};
            return rtn;
        }

        int rowPos = Character.getNumericValue(position.charAt(1));
        // System.out.println("rowPos: "+rowPos);        
        rowPos = (rowPos == 5) ? 0 :
            (rowPos == 4) ? 1 :
            (rowPos == 3) ? 2 :
            (rowPos == 2) ? 3 :
            (rowPos == 1) ? 4 : 0; 


        int colPos = position.charAt(0);
        // System.out.println("colPos: "+colPos);
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

    private static void pressEnterToContinue() {
        System.out.println("Press Enter to continue...");
        input.nextLine();
        
    }

}

