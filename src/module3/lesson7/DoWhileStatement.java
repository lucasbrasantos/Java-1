package module3.lesson7;

public class DoWhileStatement {
    
    public static void main(String[] args) {
        
        int count = 0;

        do {
            System.out.println("Hello World! line: " + (count + 1));
            count++;
        } while (count < 10);

        count = 0;

        System.out.println("Printing even numbers using do-while loop:");
        do {
            System.out.println(count * 2);
            count++;
        } while (count < 10);
    }
}
