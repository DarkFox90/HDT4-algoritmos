public class StackList<T> extends AbstractStack<T>{
    private IList<T> list;

    public StackList(IList<T> ListType) {
        this.list = ListType;
    }

    @Override
    public void push(T item){
        list.insertAtStart(item);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("La pila no tiene nada");
        }
        return list.deleteFromStart();

    }

    @Override 
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("La pila no tiene nada");
        }
        return list.getFirst();
    }

    @Override
    public int size() {
        return list.size();
    }
}


