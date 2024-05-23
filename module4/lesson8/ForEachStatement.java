package module4.lesson8;

public class ForEachStatement {
    

    public static void main(String[] args){


        int[] numeros = {12, 54, 23, 6, 7, 87, 12, 36, 51};

        int maior = 0,
            menor = 0;

        for (int i : numeros) {
            
            if (i > 30) {
                maior++;
            }else {
                menor++;
            }
        }

        System.out.printf("\n\nNumbers greater than 30: %d\n", maior);
        System.out.printf("Numbers greater than 30: %d", menor);

    }
}
