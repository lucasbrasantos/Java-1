package module4.lesson8;

public class Arrays2D {


    public static void main(String[] args) {
        
        //elementType[][] identifier;
        //elementType identifier[][];
        
        //The template fro accessing an element is
        // identifier[row][col] //
        //
        //  row*col = totalElements
        //
        //
        //  array[1][2]
        //          
        //  [0] -> [0][1][2] 1
        //  [1] -> [0][1][2] 2
        //          1  2  3

        /* 
            double[][] array2d;

            double[][] array2d = new double[2][3];

            double[][] array2d = {{80, 70, 75}, {69, 72, 74}};

            double[][] array2d = {{80, 70, 75},
                                  {69, 72, 74}};
        */


        //Ragged Arrays


        // double[][] array2d = {{80, 70, 75},
        //               {69, 72, 74, 90}};


        /*
            double[][] array2d = new double[2][];
            
            // Fill first row with new 3-element array.
            array2d[0] = new double[3];
            array2d[0][0] = 80;
            array2d[0][1] = 70;
            array2d[0][2] = 75;

            // Fill second row with a new 4-element array.
            array2d[1] = new double[4];
            array2d[1][0] = 69;
            array2d[1][1] = 72;
            array2d[1][2] = 74;
            array2d[1][3] = 90;
        */



        /* 
         * Java allows for multi-dimensional arrays of over two dimensions.
         * You can create an array of arrays of arrays, which would be a 3D array.
         * In this course, however, we’ll focus on 2-D arrays, which have many practical uses.
         */
    }
}
