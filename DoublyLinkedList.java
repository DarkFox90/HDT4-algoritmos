public class DoublyLinkedList<T> implements IList<T> {

    private DoubleNode<T> head;
    private int size;

    public DoublyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    @Override
    public void insertAtStart(T value) {
        DoubleNode<T> newNode = new DoubleNode<>(value);

        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.next = head; 
            head.prev = newNode; 
            head = newNode;    
        }
        size++;
    }

    @Override
    public T deleteFromStart() {
        if (isEmpty()) {
            return null; 
        }

        T deletedValue = head.data;
        head = head.next; 

        if (head != null) {
            head.prev = null; 
        } 
        
        size--;
        return deletedValue;
    }

    @Override
    public T getFirst() {
        if (isEmpty()) {
            return null;
        }
        return head.data;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public int size() {
        return size;
    }
}