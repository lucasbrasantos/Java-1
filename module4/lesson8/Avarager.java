package module4.lesson8;

public class Avarager{


    public static void main(String[] args){


        double sum = 0;
        for(String num : args){
            
            sum += Double.parseDouble(num); // String to double function

        }

        double avarage = (args.length > 0) ? (sum/args.length) : 0;
        System.out.printf("The avarage is: %.2f", avarage);

    }
}
