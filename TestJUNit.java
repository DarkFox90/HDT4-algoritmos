import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestJUNit {

    @Test
    public void testPush() {
        StackA<Integer> stack = new StackA<>();
        stack.push(50);
        
        assertFalse(stack.isEmpty());
        assertEquals(50, stack.peek());
    }

    @Test
    public void testPop() {
        StackA<Integer> stack = new StackA<>();
        stack.push(10);
        stack.push(20);
        
        int sacado = stack.pop();
        assertEquals(20, sacado);
        
        assertEquals(10, stack.pop());
    }

    @Test
    public void testIsEmpty() {
        StackA<Integer> stack = new StackA<>();
        assertTrue(stack.isEmpty());
        
        stack.push(99);
        assertFalse(stack.isEmpty());
        
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testPushStackA() {
        StackA<Integer> stack = new StackA<>();
        stack.push(50);
        
        assertFalse(stack.isEmpty());
        assertEquals(50, stack.peek());
    }

    @Test
    public void testPopStackA() {
        StackA<Integer> stack = new StackA<>();
        stack.push(10);
        stack.push(20);
        
        int sacado = stack.pop();
        assertEquals(20, sacado);
        assertEquals(10, stack.pop());
    }

    @Test
    public void testIsEmptyStackA() {
        StackA<Integer> stack = new StackA<>();
        assertTrue(stack.isEmpty());
        
        stack.push(99);
        assertFalse(stack.isEmpty());
        
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testPushStackO() {
        StackO<Integer> stack = new StackO<>();
        stack.push(50);
        
        assertFalse(stack.isEmpty());
        assertEquals(50, stack.peek());
    }

    @Test
    public void testPopStackO() {
        StackO<Integer> stack = new StackO<>();
        stack.push(10);
        stack.push(20);
        
        int sacado = stack.pop();
        assertEquals(20, sacado);
        assertEquals(10, stack.pop());
    }

    @Test
    public void testIsEmptyStackO() {
        StackO<Integer> stack = new StackO<>();
        assertTrue(stack.isEmpty());
        
        stack.push(99);
        assertFalse(stack.isEmpty());
        
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testPushAndPeekSinglyList() {
        IList<Integer> simpleList = new SinglyLinkedList<>();
        StackList<Integer> stack = new StackList<>(simpleList);

        stack.push(15);
        stack.push(30);

        assertFalse(stack.isEmpty());
        assertEquals(30, stack.peek());
        assertEquals(2, stack.size());
    }

    @Test
    public void testPopWithDoublyList() {
        IList<Integer> doubleList = new DoublyLinkedList<>();
        StackList<Integer> stack = new StackList<>(doubleList);

        stack.push(30);
        stack.push(23);
        stack.push(36);

        assertEquals(36, stack.pop());
        assertEquals(23, stack.pop());
        assertFalse(stack.isEmpty());
    }
}