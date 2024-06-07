package module4.lesson8;

public class ArraySearch {


    public static void main(String[] args){


        String[] colors = {"red", "green", "blue", "yellow", "white", "black", "purple"};
        String result = "not found";

        for (String color : colors) {
            if (color == "blue") {
                

                result = "found blue";
            }

        }

        System.out.println(result);


    }
}
