package datastructure.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class DCStack<E> implements DIStack<E> {
    private Deque<E> deq;

    public DCStack(Deque<E> d) {
        deq = d;
    }

    @Override
    public boolean push(E item) {
        return deq.offerFirst(item);
    }

    @Override
    public E pop() {
        return deq.pollFirst();
    }

    public static void main(String[] args) {
        DIStack<String> stk = new DCStack<>(new ArrayDeque<String>());

        // push 연산
        stk.push("1. Box");
        stk.push("2. Toy");
        stk.push("3. Robot");

        // pop 연산
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
    }
}
