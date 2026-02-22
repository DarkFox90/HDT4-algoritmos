public interface Stack<T> {
    public void push(T item);
    public T pop();
    public T peek();
    boolean isEmpty();
    int size();
}
