/* Write a program that solves the following equation and 
displays the value x and y:
1)3.4x+50.2y=44.5  
2) 2.1x+.55y=5.9 
(Assume Cramer’s rule to solve equation
ax+by=e     
x=ed-bf/ad-bc
cx+dy=f      
y=af-ec/ad-bc )
*/

import java.util.Scanner;

public class cramer2 {
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