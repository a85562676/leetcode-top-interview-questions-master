package jzoffer;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Code84_QueueWithMax {

    Queue<Integer> queue = new LinkedList<Integer>();
    Deque<Integer> deque = new LinkedList<Integer>();

    public void push_back(int e){
        queue.offer(e);

        int num = 1;                                                                   //不出的时候，也要把自身进去
        while(!deque.isEmpty() && deque.peekLast()<e){
            deque.pollLast();
            num++;                                                                      //出的时候，统计一下
        }

        while(num!=0){
            deque.offerLast(e);
            num--;
        }
    }

    public int pop_front(){
        deque.pollFirst();
        return queue.poll();
    }

    public int max(){
        return deque.peekFirst();
    }

}
