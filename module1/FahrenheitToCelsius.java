/**
 * FahrenheitToCelsius
*/

public class FahrenheitToCelsius {

    @SuppressWarnings("unused") // remove the warning of unused variable
    // eae is declared but not used
    public static void main(String[] args){

        int saturdayF, sundayF;
        saturdayF = 78;
        sundayF = 93;

        double saturdayC = (5.0/9) * (saturdayF - 32);
        double sundayC = (5.0/9) * (sundayF - 32);

        System.out.println("Weekend Avarages");
        System.out.println("Saturday: " + saturdayC + "ºC : " + saturdayF + " ºF");
        System.out.println("Sunday: " + sundayC + "ºC : " + sundayF + " ºF");

        boolean eae = sundayF > 90 ? true : false;
    }

}