package yoonsw.java.ch23;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Box");
        queue.offer("Toy");
        queue.offer("Robot");

        System.out.println("next: " + queue.peek());

        System.out.println(queue.poll());

        System.out.println(queue.poll());

        System.out.println("next: " + queue.peek());

        System.out.println(queue.poll());
    }
}
