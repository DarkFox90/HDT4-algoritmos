public abstract class AbstractStack<T> implements Stack<T>{
    
    @Override
    public boolean isEmpty() {
        return size() == 0;
    }
}
