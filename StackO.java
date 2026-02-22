import java.util.Vector;
public class StackO<T> extends AbstractStack<T> {
    Vector<T> list = new Vector<>();

    @Override
    public void push(T item){
        list.add(item);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("La pila no tiene nada");
        }
        T top = list.get(list.size()-1);
        list.remove(top);
        return top;

    }

    @Override 
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("La pila no tiene nada");
        }
        return list.get(list.size()-1);
    }

    @Override
    public int size() {
        return list.size();
    }
}
