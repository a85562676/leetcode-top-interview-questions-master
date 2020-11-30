package jzoffer;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class Code83_MaxInSlidingWindow {
    //peek取出队首元素，并不删除; poll取出队首元素，并删除;
    public static ArrayList<Integer> MaxInSlidingWindow(int[] num, int size) {
        // 思路：用双端队列实现
        ArrayList<Integer> res = new ArrayList<>();
        if (num == null || num.length < 1 || size <= 0 || size > num.length)
            return res;
        Deque<Integer> queue = new LinkedList<>();
        for (int i = 0; i < num.length; i++) {
            while (!queue.isEmpty() && queue.peek() < i - size + 1) //超出范围的去掉
                queue.poll();
            //当前值大于之前的值，之前的不可能是最大值，可以删掉
            while (!queue.isEmpty() && num[i] >= num[queue.getLast()])
                queue.removeLast();
            queue.add(i);
            if (i >= size - 1) { //此时开始是第一个滑动窗口
                res.add(num[queue.peek()]);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] num = new int[]{2,3,4,2,6,2,5,1};
        ArrayList<Integer> res = MaxInSlidingWindow(num, 3);
        System.out.println(res);
    }
}
