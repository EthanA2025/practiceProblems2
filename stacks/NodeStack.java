package stacks;

import java.util.Iterator;

public class NodeStack<E> implements Stack<E> {

    private Node<E> node;
    private int size;

    @Override
    public void push(E value) {
        node.setNext(new Node<>(value));
    }

    @Override
    public E top() {
        return this.node.getValue();
    }

    @Override
    public E pop() {
        return null;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    public static void main(String[] args) {
        NodeStack<Integer> nStack = new NodeStack<>();
        nStack.push(1);
        nStack.push(2);
        nStack.push(3);

        for (int element : nStack) {
            System.out.println(element);
        }

    }
}