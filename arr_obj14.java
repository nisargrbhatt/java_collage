
/* Write a program that creates an Array List and adds a Loan object , 
a Date object , a string, and a Circle object to the list, 
and use a loop to display all elements in the list by invoking the object’s toString() method.
*/
import java.util.*;

import javafx.scene.shape.Circle;

public class arr_obj14 {

    public static void main(String args[]) {

        ArrayList<Object> obj = new ArrayList<Object>();
        // obj.add(new Loan());
        obj.add(new Date());
        obj.add(new String("String class"));
        obj.add(new Circle());

        for (int i = 0; i < obj.size(); i++) {
            System.out.println((obj.get(i)).toString());
        }
    }
}