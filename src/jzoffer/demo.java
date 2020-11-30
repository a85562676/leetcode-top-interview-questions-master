package jzoffer;
import java.util.Deque;
import java.util.LinkedList;



public class demo {

    public static void main(String[] args) {

        Deque<Integer> queue = new LinkedList<>();
//        System.out.println(queue.getLast());
        queue.offer(10);
        System.out.println(queue.peek());
        queue.offer(20);
        System.out.println(queue.peek());
        queue.offer(30);
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue.peek());

    }
}
