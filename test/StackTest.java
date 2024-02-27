import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;


public class StackTest {
    Stack stack;
    @Before
    public void before() {
        this.stack = new Stack(new int[]{1,2,3,4,5});
    }

    @Test
    public void popTest() {
        assertEquals(5, this.stack.pop());
        assertEquals(4, this.stack.pop());
        assertEquals(3, this.stack.pop());
        assertEquals(2, this.stack.pop());
        assertEquals(1, this.stack.pop());

    }

    @Test
    public void isEmptyTest() {
        assertEquals(false, this.stack.isEmpty());
        for(int i = 0; i < 5; i++)
            this.stack.pop();
        assertEquals(true, this.stack.isEmpty());
    }

    @Test
    public void pushTest() {
        this.stack = new Stack();
        for(int i = 0; i <= 30; i += 5)
            this.stack.push(i);
        Stack expected = new Stack(new int[] {0,5,10,15,20,25,30});
        for(int i = 0; i < 7; i++) {
            assertEquals(expected.pop(), this.stack.pop());
        }
    }

    @Test
    public void isFullTest() {
        assertEquals(true, this.stack.isFull());
        this.stack.pop();
        assertEquals(false, this.stack.isFull());
    }

    @Test
    public void expandableTest() {
        assertEquals(false, this.stack.isExpandable());
        this.stack.setExpandable(true);
        assertEquals(true, this.stack.isExpandable());
    }

    @Test
    public void expandTest() {
        this.stack.setExpandable(true);
        for(int i = 0; i < 4; i++)
            this.stack.push(4*i);
        Stack expected = new Stack(new int[] {1,2,3,4,5,0,4,8,12});
        for(int i = 0; i < 9; i++)
            assertEquals(expected.pop(), this.stack.pop());
    }
}
