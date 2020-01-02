/* Write  a  test program  that prompts  the  user  to  enter ten  numbers,
  invoke  a  method  to reverse the numbers, display the numbers.
*/

import java.util.Scanner;

public class reverser10 {

    public static void rev(int a1[]) {
        System.out.println("The Reverse order is this: ");
        for (int i = 9; i >= 0; i--) {
            System.out.println(a1[i]);
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of elements you want in array:");

        int a[] = new int[10];

        System.out.println("Enter all the elements:");

        for (int i = 0; i < 10; i++)

        {

            a[i] = sc.nextInt();

        }
        rev(a);
    }
}