import java.util.Scanner;

public class cramer {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float a, b, c, d, e, f, x, y;
        System.out.println("Enter the first value in the sense of ax + by = e: ");
        a = sc.nextFloat();
        b = sc.nextFloat();
        e = sc.nextFloat();
        System.out.println("Enter the second value in the sense of ax + by = e: ");
        c = sc.nextFloat();
        d = sc.nextFloat();
        f = sc.nextFloat();

        x = ((e * d) - (b * f)) / ((a * d) - (b * c));
        y = ((a * f) - (e * c)) / ((a * d) - (b * c));

        System.out.println("The x is " + x);
        System.out.println("The y is " + y);
    }
}