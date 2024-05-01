package module2.lesson4;

public class StringMethods {

    public static void main(String[] args) {
        
        String text = "Forest cloud look tropical.";

        System.out.println(text.toLowerCase());  // output: forest cloud look tropical.
        System.out.println(text.contains("look")); //  output: true
        System.out.println(text.concat(" And They look very rainy!")); // output: Forest cloud look tropical. And They look very rainy!
        System.out.println(text.replace(" ", "_")); // replace all the " " WhiteSpaces in String text to "_"
        System.out.println(text.length()); // length() is 27, 0...26
        System.out.println(text.substring(7));
        System.out.println(text.substring(7, 17)); // if endIndex is greater than String length, or less than beginIndex, returns error
        
        
        System.out.println("=============");
        System.out.println(text);
            
    }
}
