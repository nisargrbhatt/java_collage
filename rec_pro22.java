// Write a recursive method that returns the smallest integer in an array. 
// Write a test program that prompts the user to enter an integer and display its product.

import java.util.Scanner;

public class rec_pro22 {
    public static int min(int[] ls) {
        int min = ls[ls.length - 1];
        int index = ls.length - 1;
        return min(ls, index, min);
    }

    private static int min(int[] ls, int index, int min) {
        if (index < 0) {
            return min;
        } else if (ls[index] < min) {
            return min(ls, index - 1, ls[index]);
        } else {
            return min(ls, index - 1, min);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter eight elements: ");
        int[] ls = new int[8];
        for (int i = 0; i < ls.length; i++) {
            ls[i] = sc.nextInt();
        }
        System.out.println("The min number is " + min(ls));
    }

}