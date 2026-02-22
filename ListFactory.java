public class ListFactory<T> {

    public IList<T> getList(String listType) {
        
        if (listType == null) {
            return null;
        }

        if (listType.equalsIgnoreCase("SIMPLE")) {
            return new SinglyLinkedList<T>();
            
        } else if (listType.equalsIgnoreCase("DOBLE")) {
            return new DoublyLinkedList<T>();
        }
        
        return null;
    }
}