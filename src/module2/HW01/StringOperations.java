package module2.HW01;

public class StringOperations {

    public static void main(String[] args) {
        

        String name = "Lucas";
        
        String a = name.substring(name.length()-1);
        String z = name.substring(0, (name.length()) - (name.length()-1));
        String newName = name.replace(a, "A").replace(z, "Z");

        System.out.println(name);
        System.out.println(newName);


        String URL = "www.gatech.edu";

        String newURL = URL.substring(4, URL.length()-4);
        System.out.println(newURL.concat("1331"));

    }
}
