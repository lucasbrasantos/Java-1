package module3.lesson7;

public class ForStatement {


    public static void main(String[] args) {
        

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World!");
        }

        System.out.println("Printing even numbers using for loop:");
        for (int i = 1; i < 100; i*=2) {
            // System.out.println(i * 2);
            System.out.println(i );
        }
    }
}
