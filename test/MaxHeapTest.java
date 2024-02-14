import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.util.List;


public class MaxHeapTest {
    MaxHeap heap = new MaxHeap();

    @Before
    public void before() {
        heap = new MaxHeap(new int[] {12,3,8,1,16,9,4,2,6,13});
    }

    @Test
    public void constructorTest() {
        heap = new MaxHeap(new int[]{13,9,12,3,8,6,4,1,2});
        List<Integer> expected = List.of(13,9,12,3,8,6,4,1,2);
        assertEquals(expected, heap.getArray());

        heap = new MaxHeap(new int[] {12,3,8,1,16,9,4,2,6,13});
        expected = List.of(16,13,9,6,12,8,4,1,2,3);
        assertEquals(expected, heap.getArray());
    }

    @Test
    public void getFatherTest() {
        assertEquals(16, heap.getFather(1));
        assertEquals(16, heap.getFather(2));
        assertEquals(6, heap.getFather(7));
        assertEquals(6, heap.getFather(8));
    }

    @Test
    public void getLeftTest() { 
        assertEquals(13, heap.getLeft(0));
        assertEquals(6,heap.getLeft(1));
        assertEquals(1,heap.getLeft(3));
        assertEquals(Integer.MIN_VALUE, heap.getLeft(7));
    }

    @Test
    public void getRightTest() { 
        assertEquals(9, heap.getRight(0));
        assertEquals(4,heap.getRight(2));
        assertEquals(Integer.MIN_VALUE, heap.getRight(6));
    }

    @Test
    public void insertTest() {
        heap.insert(20);
        List<Integer> expected = List.of(20,16,9,6,13,8,4,1,2,3,12);
        assertEquals(expected, heap.getArray());
        heap.insert(-1);
        expected = List.of(20,16,9,6,13,8,4,1,2,3,12,-1);
        assertEquals(expected, heap.getArray());

    }

    @Test
    public void getValueTest() {
        int num = heap.getValue(5);
        List<Integer> expected = List.of(16,13,9,6,12,3,4,1,2);
        assertEquals(8, num);
        assertEquals(expected, heap.getArray());

        num = heap.getValue(2);
        expected = List.of(16,13,4,6,12,3,2,1);
        assertEquals(9, num);
        assertEquals(expected, heap.getArray());
        num = heap.getValue(1);
        expected = List.of(16,12,4,6,1,3,2);
        //assertEquals(13, num);
        assertEquals(expected, heap.getArray());

        num = heap.getValue(0);
        expected = List.of(12,6,4,2,1,3);
        assertEquals(16, num);
        assertEquals(expected, heap.getArray());
    }
}
