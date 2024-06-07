package module2.lesson3;

/*
 *  Java has three forms of comments to help document your code:
 *
 *  --> Line comments
 *  --> Block (or multi-line) comments
 *  --> Javadoc comments
 * 
 * 
 * 
 * 
 */

public class TypesOfComments {
    
    /*

        <<<--- BLOCK COMMENT
        this is a block comment

    */
    public static void main(String[] args){

        int saturdayF, sundayF;
        saturdayF = 78;
        sundayF = 93;

        

        double saturdayC = (5.0/9) * (saturdayF - 32);
        double sundayC = (5.0/9) * (sundayF - 32);

        System.out.println("Weekend Avarages");
        System.out.println("Saturday: " + saturdayC + "ºC : " + saturdayF + " ºF");
        System.out.println("Sunday: " + sundayC + "ºC : " + sundayF + " ºF");

        // boolean eae = sundayF > 90 ? true : false;       <<<--- LINE COMMENTS
    }

    /**
     * @param args   <<<--- JAVADOC COMMENT
     * @return
     */
    public static boolean containsBanana(String[] args){




        return false;
    }


}
