
/* Write a method with following method header.
public static int gcd(int num1, int num2)
Write a program that prompts the user to enter two integers and compute the gcd of two integers.
*/
import java.util.Scanner;

public class gcd9 {
    public static int gcd(int n1, int n2) {
        int gcd = 1;
        for (int i = 1; i <= n1 && i <= n2; ++i) {
            if (n1 % i == 0 && n2 % i == 0)
                gcd = i;
        }
        return gcd;
    }

    public static void main(String args[]) {
        int n1, n2, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input two numbers: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n = gcd(n1, n2);
        System.out.println("The gcd of both number is : " + n);

    }

}