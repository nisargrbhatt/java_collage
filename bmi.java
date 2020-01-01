import java.util.Scanner;

public class bmi {
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