
/* Body  Mass  Index  (BMI)  is  a  measure  of  health  on  weight.  
It  can  be  calculated  by  taking  your weight  in  kilograms  and  
dividing  by  the  square  of  your  height  in  meters.  
Write  a  program  that prompts the user to enter a weight in pounds and 
height in inches and displays the BMI.Note:-1 pound=.45359237 Kg and 1 inch=.0254 meters.
*/
import java.util.Scanner;

public class bmi4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input weight in pounds: ");
        double weight = sc.nextDouble();
        weight = weight * (0.45359237);
        System.out.print("\nInput height in inch: ");
        double height = sc.nextDouble();
        height = height * (0.254);
        double BMI = weight / (height * height);
        System.out.println("\nThe Body Mass Index (BMI) is " + BMI + " kg/m2");

    }
}