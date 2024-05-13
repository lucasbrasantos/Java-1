package module3.lesson7;

public class WhileStatement {
    

    public static void main(String[] args) {
        


        int count = 0;

        while (count < 10) {
            
            System.out.println("Hello World! line: " + (count+1));

            count++;
        }

        count = 0;
        System.out.println("Printing even numbers using while loop:");
        while (count < 10) {
            System.out.println(count * 2);
            count++;
        }
    }
}
