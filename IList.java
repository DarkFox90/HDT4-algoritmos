public interface IList<T> {

    void insertAtStart(T value);
    T deleteFromStart();
    T getFirst();
    boolean isEmpty();
    int size();
    
}