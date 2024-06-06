
package module4.lesson9;

/**
 * ArraySearch
 */
public class ArraySearch {


    public static void main(String[] args){

        String[] countries = {
            "Nepal",
            "Guam",
            "Niger",
            "South Africa",
            "Antigua & Barbuda",
            "Brazil",
            "Algeria"
        };

        String targetCountry = "Brazil";
        String result = searchString(targetCountry, countries);
        
        System.out.printf("==============\ncountry %s %s \n\n\n", targetCountry, result);
        /////////////////////////////////////////////////////

        int[] arrayOfInts = { 39, 65, 23, 47, 2, 68, 100};
        int targetInt = 39; // 39 = true | 20 = false
        System.out.println(searchInt(targetInt, arrayOfInts));

    }

    public static String searchString(String target, String[] arr){

        String result = "not found";
        for (String e : arr) {
            if (e.equals(target)) {
                result = "found";
                break;
            }
        }
        return result;

    }

    public static boolean searchInt(int target, int[] arr){

        boolean result = false;

        for (int e : arr) {
            if (e == target) {
                result = true;
                break;
            }
        }
        

        return result;
    }

    
    
}