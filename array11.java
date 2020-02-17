/* Write a program that generate 6*6 two-dimensional matrix, 
filled with 0’s and 1’s , 
display the matrix, 
check every raw and column have an odd number’s of 1’s.
*/

public class array11 {
    public static void main(String args[]) {
        int mat[][] = { { 0, 0, 0, 1, 1, 0 }, { 0, 1, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 0 },
                { 0, 1, 0, 1, 0, 1 }, { 1, 0, 1, 0, 0, 1 } };
        int i, j;
        int r[] = { 0, 0, 0, 0, 0, 0 };
        int c[] = { 0, 0, 0, 0, 0, 0 };
        for (i = 0; i < 6; i++) {
            for (j = 0; j < 6; j++) {
                if (mat[i][j] == 1) {
                    r[i]++;
                    c[j]++;
                }

            }
        }
        for (i = 0; i < 6; i++) {
            for (j = 0; j < 6; j++) {
                System.out.print(mat[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println("The Row which has odd number of 1's: ");
        for (i = 0; i < 6; i++) {
            if (r[i] % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("The Column which has odd number of 1's: ");
        for (i = 0; i < 6; i++) {
            if (c[i] % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}