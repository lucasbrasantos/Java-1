package module3.lesson6;

public class SwitchCaseExample  {
    
    public static void main(String[] args) {
        // Suppose we want to represent the days of the week using numbers
        
        int dayOfWeek = 1; // 1 for Sunday, 2 for Monday, and so on...

        switch (dayOfWeek) {
            case 1:
                System.out.println("It's Sunday.");
                break;
            case 2:
                System.out.println("It's Monday.");
                break;
            case 3:
                System.out.println("It's Tuesday.");
                break;
            case 4:
                System.out.println("It's Wednesday.");
                break;
            case 5:
                System.out.println("It's Thursday.");
                break;
            case 6:
                System.out.println("It's Friday.");
                break;
            case 7:
                System.out.println("It's Saturday.");
                break;            
            default:
                System.out.println("Invalid day.");
        }
    }
}
