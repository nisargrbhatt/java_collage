// Write a recursive method that returns the smallest integer in an array. 
// Write a test program that prompts the user to enter an integer and display its product.

import java.util.Scanner;

public class rec_pro22 {
    public static int max(int[] ls) {
        int max = ls[ls.length - 1];
        int index = ls.length - 1;
        return max(ls, index, max);
    }

    private static int max(int[] ls, int index, int max) {
        if (index < 0) {
            return max;
        } else if (ls[index] > max) {
            return max(ls, index - 1, ls[index]);
        } else {
            return max(ls, index - 1, max);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter eight elements: ");
        int[] ls = new int[8];
        for (int i = 0; i < ls.length; i++) {
            ls[i] = sc.nextInt();
        }
        System.out.println("The max number is " + max(ls));
    }

}