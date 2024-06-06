package module4.lesson9;

public class SomeAnotherProgram {
    

    public static void main(String[] args) {
        

        String[] colors = {
            "blue",
            "red",
            "green",
            "yellow",
            "purple",
            "white",
            "black",
        };

        String result = ArraySearch.searchString("white", colors);
        System.out.println(result);
        
        result = ArraySearch.searchString("dark", colors);
        System.out.println(result);

    }
}
