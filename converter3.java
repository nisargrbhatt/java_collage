
/* Write a program that reads a number in meters, 
converts it to feet, and displays the result.
*/
import java.util.Scanner;

public class converter3 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        final double METERS_PER_FOOT = 0.305;

        System.out.print("Enter a value for meter: ");
        double meters = input.nextDouble();

        double feet = meters / METERS_PER_FOOT;

        System.out.println(feet + " feet is " + meters + " meters");
    }
}