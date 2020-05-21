// Write a program to create a file name 123.txt, if it does not exist. 
// Append a new data to it if it already exist. write 150 integers created 
// randomly into the file using Text I/O. Integers are separated by space.

import java.io.*;

public class text_io21 {

    public static void main(String[] args) {

        try (PrintWriter pw = new PrintWriter(new FileOutputStream(new File("123.txt"), true));) {
            for (int i = 0; i < 150; i++) {
                pw.print((int) (Math.random() * 100) + " ");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Stupid file error!!!");
            e.printStackTrace();
        }
    }
}