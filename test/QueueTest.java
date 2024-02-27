import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class QueueTest {
    Queue queue;

    @Before
    public void before() {
        this.queue = new Queue(new int[] {1,2,3,4,5});
    }

    @Test
    public void dequeueTest() {
        for(int i = 0; i < 5; i++) {
            assertEquals(i+1, this.queue.dequeue());
        }
        assertEquals(Integer.MIN_VALUE, this.queue.dequeue());
    }

    @Test
    public void enqueueTest() {
        for(int i = 0; i < 5; i++)
            this.queue.enqueue(i);
        Queue expected = new Queue(new int[] {1,2,3,4,5,0,1,2,3,4});
        assertEquals(true, this.queue.equals(expected));
    }

    @Test
    public void isEmpty() {
        this.queue = new Queue();
        assertEquals(true, this.queue.isEmpty());
        this.queue.enqueue(10);
        assertEquals(false, this.queue.isEmpty());
    }

    @Test
    public void equalsTest() {
        assertEquals(true, this.queue.equals(this.queue));
        assertEquals(false, this.queue.equals(new Queue()));
    }

    @Test
    public void getSizeTest() {
        assertEquals(5, this.queue.getSize());
        this.queue.enqueue(10);
        assertEquals(10, this.queue.getSize());
    }

    @Test
    public void getNumberOfElementsTest() {
        assertEquals(5, this.queue.getNumberOfElements());
        this.queue.enqueue(10);
        assertEquals(6, this.queue.getNumberOfElements());
    } 
}
