package yoonsw.java.ch23;

import java.util.ArrayDeque;
import java.util.Deque;

public class DefinedStack {
    public static void main(String[] args) {
        DIStack<String> stk = new DCStack<>(new ArrayDeque<>());

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

interface DIStack<E> {
    boolean push(E item);

    E pop();
}

class DCStack<E> implements DIStack<E> {
    private Deque<E> deq;

    DCStack(Deque<E> d) {
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
}
