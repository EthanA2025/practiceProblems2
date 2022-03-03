package stacks;
public interface Stack<E> extends Iterable<E>{
    void push (E value);
    E top();
    E pop();
    int size();
}
