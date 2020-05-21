// Write a generic method that returns the minimum elements in a two dimensional array.

public class generic_meth23 {
    public static <me extends Comparable<me>> me min(me[][] ls) {

        me min = ls[0][0];
        for (me[] elements : ls) {
            for (me element : elements) {
                if (element.compareTo(min) < 0) {
                    min = element;
                }
            }
        }

        return min;
    }

    public static void main(String[] args) {

        Integer[][] ls = new Integer[10][10];
        int value = 0;
        for (int i = 0; i < ls.length; i++) {
            for (int j = 0; j < ls[i].length; j++) {
                ls[i][j] = value++;
            }
        }

        System.out.println("Min = " + min(ls));
    }

}