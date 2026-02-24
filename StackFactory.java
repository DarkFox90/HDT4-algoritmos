public class StackFactory<T> {
    public Stack<T> getStack(String stackType, String listType) {
        if (stackType == null) {
            return null;
        }
        if(stackType.equalsIgnoreCase("ArrayList")) {
            return new StackA<T>();
        } else if(stackType.equalsIgnoreCase("Vector")) {
            return new StackO<T>();
        } else if (stackType.equalsIgnoreCase("List")) {
            ListFactory<T> listFactory = new ListFactory<>();
            IList<T> selectedList = listFactory.getList(listType);
            return new StackList<T>(selectedList);
        }
        return null;
    }
}
