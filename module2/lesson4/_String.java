package module2.lesson4;

public class _String {


    public static void main(String[] args) {
        

        String major = new String("Computer Science");
        String interest;
        interest = major;

        System.out.println(interest);
        major = "Long walks on the beach";
        interest = major;
        
        System.out.println(interest);
        System.out.println(major);

    }
}
