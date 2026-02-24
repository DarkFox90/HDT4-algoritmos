public class SinglyLinkedList<T> implements IList<T> {
    private Node<T> head;
    private int size;

    public SinglyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    @Override
    public void insertAtStart(T value) {
        Node<T> newNode = new Node<>(value);
        newNode.next = head; 
        head = newNode;      
        size++;
    }

    @Override
    public T deleteFromStart() {
        if (isEmpty()) {
            return null; 
        }
        T deletedValue = head.data; 
        head = head.next;          
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