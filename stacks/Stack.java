package stacks;
public interface Stack<E> {
    void push (E value);
    E top();
    E pop();
    int size();
}
