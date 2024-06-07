package module2.lesson5;

import java.text.DecimalFormat;

public class DecimalFormatDemo {


    public static void main(String[] args) {
        DecimalFormat formatter1 = new DecimalFormat("0.0");
        DecimalFormat formatter2 = new DecimalFormat("00.00");
        DecimalFormat formatter3 = new DecimalFormat(".00");
        DecimalFormat formatter4 = new DecimalFormat("0.00%");
        

        System.out.println("unformatteed: .8675309");
        System.out.println("0.0: " + formatter1.format(.8675309));
        System.out.println("00.00: " + formatter2.format(.8675309));
        System.out.println(".00: " + formatter3.format(.8675309));
        System.out.println("0.00%: " + formatter4.format(.8675309));
        System.out.println(".00: " + formatter3.format(8675309));

        //  # (pound/hash)  - allow you to write patterns with optional digits
        DecimalFormat hashFormatter = new DecimalFormat("#.00");
        String numStr1 = hashFormatter.format(.8675309);
        String numStr2 = hashFormatter.format(555.8675309);
        System.out.println("\n\nHASH FORMATTER - #");
        System.out.println("Unformatted: .8675309\nFormatted: " + numStr1);
        System.out.println("\nUnformatted: 555.8675309\nFormatted: " + numStr2);


        System.out.printf("%6.2f", 597.7231);

    }
}
