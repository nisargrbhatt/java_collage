/* Write  a  program  that  prompts  the  user  to  enter  
a  decimal  number  and  displays  the  number  in  a fraction.
Hint:  Read  the  decimal  number  as  a  string,  extract  the  integer  part  
and  fractional  part  from  the string.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.text.NumberFormat;

public class dec_fra16 {

    public static void main(String[] args) throws IOException {

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter a decimal number.");
        String input = console.readLine();
        double decimal = Double.parseDouble(input);
        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMaximumFractionDigits(4);
        formatter.setMinimumFractionDigits(2);
        System.out.println("Result:");
        System.out.println(formatter.format(decimal));
        System.exit(0);

    }

}