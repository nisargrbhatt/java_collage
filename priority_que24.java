// Define MYPriorityQueue class that extends Priority Queue to 
// implement the Cloneable interface and implement the clone() 
// method to clone a priority queue.

import java.util.PriorityQueue;

public class priority_que24 {
    static class MyPriorityQueue<me> extends PriorityQueue<me> implements Cloneable {

        @Override
        public Object clone() throws CloneNotSupportedException {

            MyPriorityQueue<me> clone = new MyPriorityQueue<>();

            this.forEach(clone::offer);

            return clone;
        }

    }

    public static void main(String[] args) {

        MyPriorityQueue<String> queue = new MyPriorityQueue<>();
        queue.offer("My");
        queue.offer("Name");
        queue.offer("Is");
        queue.offer("Nisarg");

        MyPriorityQueue<String> queue1 = null;
        try {
            queue1 = (MyPriorityQueue<String>) (queue.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.print(queue1);
    }

}