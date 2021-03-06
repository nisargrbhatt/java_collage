
/* Write a program that reads an integer and displays all its smallest factors in increasing order. 
For example if input number is 120, 
the output should be as follows:2,2,2,3,5.
*/
import java.util.Scanner;

public class smallfactor8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        int index = 2;

        while (number / index != 1) {

            if (number % index == 0) {
                System.out.print(index + ", ");
                number /= index;
            } else
                index++;
        }
        System.out.println(number + ".");
    }
}